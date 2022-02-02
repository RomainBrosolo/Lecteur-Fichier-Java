public class FichierPalindrome extends Fichier {
	private String nameFile;
	
	// Constructeur de la classe
	public FichierPalindrome(String nameFile) {
		super();
		this.nameFile = nameFile;
	}
	
	@Override
	public void display() {
		boolean value = super.isFile(nameFile);
		if(value == true){
			super.readFile();
			String reverse = "";
			for(int i = 0 ; i < content.size() ; i++){
				String[] words = content.get(i).split(" ");
				for(int j = 0 ; j < words.length; j++){
					int taille = words[j].length();
					for(int z = taille -1 ; z > -1 ; z--)
			         {
			            reverse += words[j].substring( z, z +1 );
			         }
					reverse += " ";
				}
				reverse += "\n";
			}
			System.out.println(reverse);
		}
		else {
			System.out.println("Erreur : Le fichier sélectionné ("+ nameFile +") n'existe pas");
		}
	}
}