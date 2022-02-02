/*
 * Interface du lecteur de fichier
 * Plusieurs classes utilisent les memes m�thodes d'o� l'utilit� de cr�er une interface
 * On la fait impl�menter par les classes qui l'utilise
 */
public interface InterfaceFichier {
	boolean isFile(String name);
	void display();
	void readFile();
}