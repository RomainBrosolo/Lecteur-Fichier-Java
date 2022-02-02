/*
 * Interface du lecteur de fichier
 * Plusieurs classes utilisent les memes méthodes d'où l'utilité de créer une interface
 * On la fait implémenter par les classes qui l'utilise
 */
public interface InterfaceFichier {
	boolean isFile(String name);
	void display();
	void readFile();
}