package task;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Pet cow = ()->"Я корова Мууу-Мууу";
		Pet cat = ()->"Я кіт Мяууу-Мяууу";
		Pet dog = ()->"Я пес Гаууу-Гаууу";
		
		System.out.println(cow.petVoice());	
		System.out.println(cat.petVoice());	
		System.out.println(dog.petVoice());	
		
		
		
	}
	

}
