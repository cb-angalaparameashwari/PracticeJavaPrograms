package week1.day2;



public class AnimalCatogory implements AnimalInterface {

		public String kingdom;
		public String classOfAnimal;
		public String familyName;
		public String commonName;
		public String scientificName;
		//Constructor for AnimalCatogory class
		public AnimalCatogory(String kingdom, String classOfAnimal , String familyName, String commonName , String scientificName ){
			this.kingdom = kingdom;
			this.classOfAnimal = classOfAnimal;
			this.familyName = familyName;
			this.commonName = commonName;
			this.scientificName = scientificName;
		}
		//Display Animal Names
		public void displayAnimals(){
			System.out.println(catagory);
			System.out.println("Animal's Kingdom "+ kingdom);
			System.out.println("Animal's class "+ classOfAnimal);
			System.out.println("Animal's Family name "+ familyName);
			System.out.println("Animal's Common name "+ commonName);
			System.out.println("Animal's Scientific name "+ scientificName);
		}

}