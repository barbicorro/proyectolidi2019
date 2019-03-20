package Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

import Controlador.Configuracion;


public class Panel_configuracion extends JPanel {
	private Imagenes imgGral = new Imagenes();
	private int x,y,num_img_de_configuracion,imgActual;
	private Configuracion miConfiguracion;
	public Panel_configuracion(){
		setBackground(Color.PINK);
		setBounds(512, 0, 512, 768);
		
	}
	
	public void actualizar(int id, double x, double y ) {
		x=x-0.5;
		
		this.x=(int) (x*1024);
		this.y=(int) (y*768);
		this.num_img_de_configuracion=id;
		repaint();
	}
	
	public void dibujar_punto(double x, double y) {
		x=x-0.5;
		
		this.x=(int) (x*1024);
		this.y=(int) (y*768);
		this.num_img_de_configuracion=666; //ID del punto es 666 
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		if(num_img_de_configuracion==9) { // 9 es el id de la regla
			miConfiguracion.getConfig_Regla()[1]=x;
			miConfiguracion.getConfig_Regla()[2]=y;
			g.drawImage(imgGral.getImagen_config()[0], miConfiguracion.getConfig_Regla()[1], miConfiguracion.getConfig_Regla()[2], (miConfiguracion.getConfig_Regla()[1]+500) , (miConfiguracion.getConfig_Regla()[2] + 700), 0, 0, 512, 768, null);
			imgActual=0; //posicion de la regla en el vector
		}
		g.drawImage(imgGral.getImagen_config()[imgActual], miConfiguracion.getConfig_Regla()[1], miConfiguracion.getConfig_Regla()[2], (miConfiguracion.getConfig_Regla()[1]+500) , (miConfiguracion.getConfig_Regla()[2] + 700), 0, 0, 512, 768, null);
		if((imgActual==0)&&(num_img_de_configuracion==666)){
			if(((x-miConfiguracion.getConfig_Regla()[1])<90)&&((y-miConfiguracion.getConfig_Regla()[2])<86)){ //Hizo click en el nivel 1. 
				System.out.println("Nivel 1");
				miConfiguracion.getConfig_Regla()[0]=50;
			}else {
				if(((x-miConfiguracion.getConfig_Regla()[1])<90)&&(((y-miConfiguracion.getConfig_Regla()[2])>90)&&(y-miConfiguracion.getConfig_Regla()[2])<185)){
					System.out.println("Nivel 2");
					miConfiguracion.getConfig_Regla()[0]=100;
				}else
					if(((x-miConfiguracion.getConfig_Regla()[1])<90)&&(((y-miConfiguracion.getConfig_Regla()[2])>185)&&(y-miConfiguracion.getConfig_Regla()[2])<280)){
						System.out.println("Nivel 3");
						miConfiguracion.getConfig_Regla()[0]=190;
					}else
						if(((x-miConfiguracion.getConfig_Regla()[1])<90)&&(((y-miConfiguracion.getConfig_Regla()[2])>280)&&(y-miConfiguracion.getConfig_Regla()[2])<375)){
							System.out.println("Nivel 4");
							miConfiguracion.getConfig_Regla()[0]=250;
					}else
						if(((x-miConfiguracion.getConfig_Regla()[1])<90)&&(((y-miConfiguracion.getConfig_Regla()[2])>375)&&(y-miConfiguracion.getConfig_Regla()[2])<470)){
							System.out.println("Nivel 5");
							miConfiguracion.getConfig_Regla()[0]=400;
						}
			
					}
		}
		
		
		

		if(num_img_de_configuracion==666) { //solo lo utilizo para configurar algunas cosas no se usa en el juego final. O SI?
			g.drawImage(imgGral.getImage(1), x, y, (x+25), (y+25), 0, 0, 512, 768, null);
			
		}
	}
	

}
