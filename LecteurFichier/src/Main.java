import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		File repertoire  = new File("fichiers");
	    File[] liste = repertoire.listFiles();
		System.out.println("Lancement du lecteur ..."); 
		Thread.sleep(1500);
		System.out.format("\nListe des fichiers dans le dossier :\n");
		
		for(File item : liste){
	        if(item.isFile())
	        { 
	        System.out.format(item.getName()+"\n");
	        } 
	    }
		
		System.out.println("\nSaisissez le nom d'un des fichiers ci-dessus (hors .txt): ");
		String name_file = scanner.nextLine();
		
		System.out.println("Lecture du fichier en cours...");
		Thread.sleep(2000);
		
		System.out.println("\nFichier Normal :");
		FichierNormal file1 = new FichierNormal("fichiers/"+name_file+".txt");
		file1.display();
		
		System.out.println("\nFichier Palindromique : ");
		FichierPalindrome file2 = new FichierPalindrome("fichiers/"+name_file+".txt");
		file2.display();
		
		System.out.println("\nFichier Reverse : ");
		FichierInverse file3 = new FichierInverse("fichiers/"+name_file+".txt");
		file3.display();
		
		System.out.println("\nFin de la lecture...");		
	}
}