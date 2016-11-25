package com.example.fredy.examenunidaddos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Vista vista = new Vista(this);
        setContentView(vista);
    }
    //Primero debemos hacer una vista, seguidamente una clase donde irá el canvas y finalmente el pincel para poder dibujar
    class Vista extends View{

        public Vista(Context context){

            super(context);
        }

        public void onDraw(Canvas canvas){

            canvas.drawRGB(25,25,25);

            //Obtenemos el ancho (widht) y el alto (height)
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();

            //Ahora vamos a declarar los pinceles que vamos a usar para dibujar los circulos

            //Pinceles
            Paint pincelamarillo=new Paint();
            pincelamarillo.setARGB(255,255,255,51);

            Paint pincelrojo=new Paint();
            pincelrojo.setARGB(255,255,0,0);

            Paint pincelazul=new Paint();
            pincelazul.setARGB(255,0,128,255);

            Paint pincelnegro=new Paint();
            pincelnegro.setARGB(255,0,0,0);

            Paint pincelblanco=new Paint();
            pincelblanco.setARGB(255,255,255,255);
            //pincelblanco.setStyle(Paint.Style.STROKE);

            //X Y RADIO Y PINCEL EN LOS CIRCULOS

            //DIBUJADO DE CIRCULOS

            //Circulo grande
            Path Circulo1 = new Path();

            Circulo1.addCircle(ancho/2,alto/2,ancho/2,Path.Direction.CCW);

            canvas.drawPath(Circulo1,pincelblanco);

            //Circulos medianos
            Path Circulo2 = new Path();

            Circulo2.addCircle(ancho/2,alto/2,ancho/3,Path.Direction.CCW);

            canvas.drawPath(Circulo2,pincelazul);

            Path Circulo3 = new Path();

            Circulo3.addCircle(ancho/2,alto/2,ancho/4,Path.Direction.CCW);

            canvas.drawPath(Circulo3,pincelrojo);

            //Circulo pequeño
            Path Circulo4 = new Path();

            Circulo4.addCircle(ancho/2,alto/2,ancho/8,Path.Direction.CCW);

            canvas.drawPath(Circulo4,pincelamarillo);

            //DIBUJADO DE TEXTO-------------------------------------------------------------------

            //Grosor del pincel

            pincelnegro.setStrokeWidth(10);

            //Estilo

            pincelnegro.setStyle(Paint.Style.FILL);

            //Tamaño de letra

            pincelnegro.setTextSize(20);

            //Tipografía

            pincelnegro.setTypeface(Typeface.DEFAULT);

            //Dibujar texto dentro de un trazo llamando del nuevo al canvas
            canvas.drawTextOnPath("10",Circulo4,100,100,pincelnegro);

            /*//Circulo1.addCircle(,Path.Direction.CCW);
            //circulo blanco (grande)
            canvas.drawCircle(ancho/2,alto/2,ancho/2,pincelblanco);


            //circulos medianos
            canvas.drawCircle(ancho/2,alto/2,ancho/3,pincelazul);
            canvas.drawCircle(ancho/2,alto/2,ancho/4,pincelrojo);



            //circulo pequeño
            canvas.drawCircle(ancho/2,alto/2,ancho/8,pincelamarillo);

            //DIBUJADO DE TEXTO-------------------------------------------------------------------

            //Grosor del pincel

            pincelnegro.setStrokeWidth(1);

            //Estilo

            pincelnegro.setStyle(Paint.Style.FILL);

            //Tamaño de letra

            pincelnegro.setTextSize(40);

            //Tipografía
            pincelnegro.setTypeface(Typeface.SANS_SERIF);

            //Dibujar texto dentro de un trazo llamando del nuevo al canvas
            canvas.drawTextOnPath("10",canvas,ancho/2,alto/2,pincelnegro);*/
        }
    }
}

