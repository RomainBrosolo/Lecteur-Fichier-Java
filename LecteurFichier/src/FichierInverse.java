public class FichierInverse extends Fichier {
	private String nameFile;
	
	// Constructeur de la classe
	public FichierInverse(String nameFile) {
		super();
		this.nameFile = nameFile;
	}

	@Override
	public void display() {
		boolean value = super.isFile(nameFile);
		if(value == true){
			super.readFile();
			for(int i = content.size()-1 ; i >= 0 ; i--){
				System.out.println(content.get(i));
			}
		}
		else {
			System.out.println("Erreur : Le fichier sélectionné ("+ nameFile +") n'existe pas");
		}	
	}
}