import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 *  Classe abstraite car elle n'est pas instanciable
 *  C'est une base aux autres classes qui hérite d'elle
 */
abstract class Fichier implements InterfaceFichier {	
	private File file;
	protected ArrayList<String> content;				
	
	
	// Constructeur de la classe mère
	public Fichier(){
		this.file = null;
		this.content = new ArrayList<String>();
	}
	
	public boolean isFile(String name){
		file = new File(name);
		if(file.isFile()){
			if(file.canRead()){
				return true;
			}
		}
		return false;
	}
	
	public void readFile() {
		try {
			InputStream input = new FileInputStream(file); 
			InputStreamReader input_reader = new InputStreamReader(input);
			BufferedReader buffer = new BufferedReader(input_reader);
			String ligne;
			while ((ligne= buffer.readLine()) != null){
				content.add(ligne);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public abstract void display();
}