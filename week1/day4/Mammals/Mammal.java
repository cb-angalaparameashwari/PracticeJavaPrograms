package week1.day4.Mammals;
import java.util.*;
public class Mammal{

public static void main(String[] args){

ArrayList<Animal> animalList = new ArrayList<Animal>();
ArrayList<Bird> birdList = new ArrayList<Bird>();

Dog pomeranian = new Dog();
pomeranian.getName();
pomeranian.setName();
pomeranian.getGender();
pomeranian.setGender();
pomeranian.setLocomotion();
pomeranian.setfoodChain();

animalList.add(pomeranian);

Cow cow = new Cow();
cow.getName();
cow.setName();
cow.getGender();
cow.setGender();
cow.setLocomotion();
cow.setfoodChain();

animalList.add(cow);

Bat bat = new Bat();
bat.getName();
bat.setName();
bat.getGender();
bat.setGender();
bat.setLocomotion();
bat.setfoodChain();

birdList.add(bat);

Parrot parrot = new Parrot();
parrot.getName();
parrot.setName();
parrot.getGender();
parrot.setGender();
parrot.setLocomotion();
parrot.setfoodChain();

birdList.add(parrot);

Ostrich ostrich = new Ostrich();
ostrich.getName();
ostrich.setName();
ostrich.getGender();
ostrich.setGender();
ostrich.setLocomotion();
ostrich.setfoodChain();

birdList.add(ostrich);
//printHerb(animalList,birdList);
System.out.println("herbivoroes are :");
//Print Herbivorous
Animal i = new Dog();
Iterator itr = animalList.iterator(); 
        // checking the next element availabilty 
        while (itr.hasNext()) 
        { 
            //  moving cursor to next element 
          	i  = (Animal)itr.next();
            System.out.println(i.name); 
        } 
}
}

