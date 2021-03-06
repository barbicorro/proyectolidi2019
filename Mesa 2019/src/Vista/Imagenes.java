package Vista;
import java.awt.Graphics2D;
import java.util.Date;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


/**

 * Esta clase se encarga de levantar las imagenes de cada objeto, las mismas se encuentran dentro del proyecto.
 
	
 * @author: Franco Pirondo, Barbara Corro, Barbara Ibañez




 */
public class Imagenes {

	private BufferedImage[] image=new BufferedImage[99] ;
	private BufferedImage[] imagen_config=new BufferedImage[26];
	private BufferedImage[] imagen_gomas=new BufferedImage[7];
	private BufferedImage[] imagen_lapiz=new BufferedImage[1];
	private BufferedImage imagen_fondo;
	private BufferedImage fondo;
	
	
	private String [] rutaSellos= {
			"src/Imagenes/Objeto0/0-0.png", //0- Mamushka
			"src/Imagenes/Objeto0/0-1.png",   
			"src/Imagenes/Objeto0/0-2.png",  
			"src/Imagenes/Objeto0/0-3.png",  
			"src/Imagenes/Objeto0/0-4.png",  
			"src/Imagenes/Objeto0/0-5.png",  
			"src/Imagenes/Objeto0/0-6.png", 
			"src/Imagenes/Objeto0/0-7.png",  
			"src/Imagenes/Objeto0/0-8.png",  
			"src/Imagenes/Objeto0/0-9.png", 
			"src/Imagenes/Objeto0/0-10.png", 
			"src/Imagenes/Objeto1/1-0.png",  //1- Pelota
			"src/Imagenes/Objeto1/1-1.png",
			"src/Imagenes/Objeto1/1-2.png",
			"src/Imagenes/Objeto1/1-3.png",
			"src/Imagenes/Objeto1/1-4.png",
			"src/Imagenes/Objeto1/1-5.png",
			"src/Imagenes/Objeto1/1-6.png",
			"src/Imagenes/Objeto1/1-7.png",  
			"src/Imagenes/Objeto1/1-8.png",  
			"src/Imagenes/Objeto1/1-9.png", 
			"src/Imagenes/Objeto1/1-10.png",
			"src/Imagenes/Objeto2/2-0.png",  //2- Caracol1
			"src/Imagenes/Objeto2/2-1.png",
			"src/Imagenes/Objeto2/2-2.png",
			"src/Imagenes/Objeto2/2-3.png",
			"src/Imagenes/Objeto2/2-4.png",
			"src/Imagenes/Objeto2/2-5.png",
			"src/Imagenes/Objeto2/2-6.png",
			"src/Imagenes/Objeto2/2-7.png",  
			"src/Imagenes/Objeto2/2-8.png",  
			"src/Imagenes/Objeto2/2-9.png", 
			"src/Imagenes/Objeto2/2-10.png",
			"src/Imagenes/Objeto3/3-0.png",  //3- Caracol2
			"src/Imagenes/Objeto3/3-1.png",
			"src/Imagenes/Objeto3/3-2.png",
			"src/Imagenes/Objeto3/3-3.png",
			"src/Imagenes/Objeto3/3-4.png",
			"src/Imagenes/Objeto3/3-5.png",
			"src/Imagenes/Objeto3/3-6.png",
			"src/Imagenes/Objeto3/3-7.png",  
			"src/Imagenes/Objeto3/3-8.png",  
			"src/Imagenes/Objeto3/3-9.png", 
			"src/Imagenes/Objeto3/3-10.png",
			"src/Imagenes/Objeto4/4-0.png",  //4- Caracol3
			"src/Imagenes/Objeto4/4-1.png",
			"src/Imagenes/Objeto4/4-2.png",
			"src/Imagenes/Objeto4/4-3.png",
			"src/Imagenes/Objeto4/4-4.png",
			"src/Imagenes/Objeto4/4-5.png",
			"src/Imagenes/Objeto4/4-6.png",
			"src/Imagenes/Objeto4/4-7.png",  
			"src/Imagenes/Objeto4/4-8.png",  
			"src/Imagenes/Objeto4/4-9.png", 
			"src/Imagenes/Objeto4/4-10.png",
			"src/Imagenes/Objeto5/5-0.png",  //5- Flor rosa
			"src/Imagenes/Objeto5/5-1.png",
			"src/Imagenes/Objeto5/5-2.png",
			"src/Imagenes/Objeto5/5-3.png",
			"src/Imagenes/Objeto5/5-4.png",
			"src/Imagenes/Objeto5/5-5.png",
			"src/Imagenes/Objeto5/5-6.png",
			"src/Imagenes/Objeto5/5-7.png",  
			"src/Imagenes/Objeto5/5-8.png",  
			"src/Imagenes/Objeto5/5-9.png", 
			"src/Imagenes/Objeto5/5-10.png",
			"src/Imagenes/Objeto6/6-0.png",  //6- Flor amarilla
			"src/Imagenes/Objeto6/6-1.png",
			"src/Imagenes/Objeto6/6-2.png",
			"src/Imagenes/Objeto6/6-3.png",
			"src/Imagenes/Objeto6/6-4.png",
			"src/Imagenes/Objeto6/6-5.png",
			"src/Imagenes/Objeto6/6-6.png",
			"src/Imagenes/Objeto6/6-7.png",  
			"src/Imagenes/Objeto6/6-8.png",  
			"src/Imagenes/Objeto6/6-9.png", 
			"src/Imagenes/Objeto6/6-10.png",
			"src/Imagenes/Objeto7/7-0.png",  //7- Flor Naranja
			"src/Imagenes/Objeto7/7-1.png",
			"src/Imagenes/Objeto7/7-2.png",
			"src/Imagenes/Objeto7/7-3.png",
			"src/Imagenes/Objeto7/7-4.png",
			"src/Imagenes/Objeto7/7-5.png",
			"src/Imagenes/Objeto7/7-6.png",
			"src/Imagenes/Objeto7/7-7.png",  
			"src/Imagenes/Objeto7/7-8.png",  
			"src/Imagenes/Objeto7/7-9.png", 
			"src/Imagenes/Objeto7/7-10.png",
			"src/Imagenes/Objeto8/8-0.png",  //8- Flor Blanca
			"src/Imagenes/Objeto8/8-1.png",
			"src/Imagenes/Objeto8/8-2.png",
			"src/Imagenes/Objeto8/8-3.png",
			"src/Imagenes/Objeto8/8-4.png",
			"src/Imagenes/Objeto8/8-5.png",
			"src/Imagenes/Objeto8/8-6.png",
			"src/Imagenes/Objeto8/8-7.png",  
			"src/Imagenes/Objeto8/8-8.png",  
			"src/Imagenes/Objeto8/8-9.png", 
			"src/Imagenes/Objeto8/8-10.png",};  
	
	private String [] rutaObjetosConfiguracion= {
			"src/Imagenes/Zoom/Regla-13.png",  								//0
			"src/Imagenes/Zoom/Regla-14.png",								//1
			"src/Imagenes/Zoom/Regla-15.png",								//2
			"src/Imagenes/Zoom/Regla-16.png",								//3
			"src/Imagenes/Zoom/Regla-17.png",								//4
			"src/Imagenes/Transparencia/Transparencia18.png",				//5
			"src/Imagenes/Transparencia/Transparencia19.png",				//6
			"src/Imagenes/Transparencia/Transparencia20.png",				//7
			"src/Imagenes/SelectorFondo/Circulo-cromaticoBlanco.png",  		//8
			"src/Imagenes/SelectorFondo/Circulo-cromaticoRojo.png",  		//9
			"src/Imagenes/SelectorFondo/Circulo-cromaticoFucsia.png",  		//10
			"src/Imagenes/SelectorFondo/Circulo-cromaticoAzul.png",  		//11
			"src/Imagenes/SelectorFondo/Circulo-cromaticoCeleste.png",  	//12
			"src/Imagenes/SelectorFondo/Circulo-cromaticoVerde.png",  		//13
			"src/Imagenes/SelectorFondo/Circulo-cromaticoAmarillo.png",		//14
			"src/Imagenes/ColoresTexturas/CirculoBlanco.png",					//15
			"src/Imagenes/ColoresTexturas/CirculoRojo.png",						//16
			"src/Imagenes/ColoresTexturas/CirculoRosa.png",						//17
			"src/Imagenes/ColoresTexturas/CirculoAzul.png",						//18
			"src/Imagenes/ColoresTexturas/CirculoVerde.png",					//19
			"src/Imagenes/ColoresTexturas/CirculoAmarillo.png",					//20
			"src/Imagenes/ColoresTexturas/CirculoSepia.png",					//21
			"src/Imagenes/ColoresTexturas/CirculoDesenfoque.png",				//22
			"src/Imagenes/ColoresTexturas/CirculoPixel.png",					//23
			"src/Imagenes/ColoresTexturas/CirculoByN.png",						//24
			"src/Imagenes/ColoresTexturas/CirculoGrises.png",};  				//25
	
	private String [] rutaGomas= {
			"src/Imagenes/Goma/cuadradoblanco.png", 					//0
			"src/Imagenes/Goma/cuadradorojo.png",						//1
			"src/Imagenes/Goma/cuadradomagenta.png",					//2
			"src/Imagenes/Goma/cuadradoazul.png",						//3
			"src/Imagenes/Goma/cuadradocian.png",						//4
			"src/Imagenes/Goma/cuadradoverde.png",						//5
			"src/Imagenes/Goma/cuadradoamarillo.png",};					//6
	
	private String [] rutaLapiz= {
			"src/Imagenes/Lapiz/LapizNegro.png",};						//0
	
						
	private String rutaFondo= "src/Imagenes/fondo_config.png";
	/**

     * Constructor de la clase, se encarga de llamar a los demas metodos en el orden correcto.
     
     */


	public Imagenes()  {
		cargaImagenes();
		cargarImagenesConfiguracion();
		cargarImagenesGomas();
		cargarImagenesLapiz();
		cargarFondo();
		
	}
	public BufferedImage getFondo() {
		return fondo;
	}
	public void setFondo(BufferedImage fondo) {
		this.fondo = fondo;
	}
	public void cargaImagenes()  {
		try {
			for(int i=0; i<image.length; i++) {
				image[i]=ImageIO.read(new File(rutaSellos[i]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public void cargarImagenesConfiguracion()  {
		try {
			for(int i=0; i<imagen_config.length; i++) {
				imagen_config[i]=ImageIO.read(new File(rutaObjetosConfiguracion[i]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void cargarImagenesGomas()  {
		try {
				for(int i=0; i<imagen_gomas.length; i++) {
					imagen_gomas[i]=ImageIO.read(new File(rutaGomas[i]));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	
	public void cargarImagenesLapiz()  {
		try {
				for(int i=0; i<imagen_lapiz.length; i++) {
					imagen_lapiz[i]=ImageIO.read(new File(rutaLapiz[i]));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	
	public void cargarFondo() {
		try {
			fondo=ImageIO.read(new File(rutaFondo));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public BufferedImage getImagen_gomas(int i) {
		return imagen_gomas[i];
	}
	public void setImagen_gomas(BufferedImage[] imagen_gomas) {
		this.imagen_gomas = imagen_gomas;
	}
	
	public BufferedImage getImagen_lapiz(int i) {
		return imagen_lapiz[i];
	}
	public void setImagen_lapiz(BufferedImage[] imagen_lapiz) {
		this.imagen_lapiz = imagen_lapiz;
	}
	
	public BufferedImage[] getImagen_config() {
		return imagen_config;
	}
	public void setImagen_config(BufferedImage[] imagen_config) {
		this.imagen_config = imagen_config;
	}
	
	public BufferedImage getImage(int i) {
		return image[i];
	}
	public void setImage(BufferedImage image, int i) {
		this.image[i] = image;
	}
	/**

     * Método que imprime la ubicacion de los objetos. Este luego se utiliza en la clase mural para guardar la ubicacion de los objetos una vez que superan los 100 elementos de esta forma se optimizá el almacenamiento de la posición de los obejtos en el array.
     * No confundir con la imagen que se guarda con el objeto guardar.
	 * @see Mural.java
     */
	
	public void imprimirCap(JPanel paintPane) {
	
		
		BufferedImage image = new BufferedImage(1024, 768, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = image.createGraphics();
		paintPane.printAll(g);
		g.dispose();
		/*try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		try { 
		    System.out.println("imprimio en cap "+  ImageIO.write(image, "png", new File("src/Imagenes/MuralActual" + "/copiaMuralActual.png"))); 
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	/**

     * Método que se encarga de guardar el mural

     */


	public void guardarMural(JPanel paintPane) {
		BufferedImage image = new BufferedImage(1024, 768, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = image.createGraphics();
		paintPane.printAll(g);
		g.dispose();
		Date date = new Date() ;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy HH-mm-ss") ;
		try {
			System.out.println("imprimio en guardar mural " + ImageIO.write(image, "png", new File("src/Imagenes/MuralesGuardados/"+dateFormat.format(date)+".png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	/**

     * Método que se encarga de levantar la captura de imagen que se realiza cuando se superan los 300 elementos
     * No confundir con la imagen que se guarda con el objeto guardar.
	 * @see Mural.java
     */
	
	public BufferedImage getCap() {
		try {
			imagen_fondo=ImageIO.read(new File("src/Imagenes/MuralActual" + "/copiaMuralActual.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return imagen_fondo;
	}
	


}