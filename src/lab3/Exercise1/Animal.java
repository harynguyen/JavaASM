package lab3.Exercise1;

import java.io.Serializable;
import java.util.Scanner;

public class Animal implements Serializable {
    private String type, name, voice;
    private boolean canfly;
    private int numberofleg;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal() {
    }

    public Animal(String type, String name, String voice, boolean canfly, int numberofleg) {
        this.type = type;
        this.name = name;
        this.voice = voice;
        this.canfly = canfly;
        this.numberofleg = numberofleg;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public boolean getCanfly() {
        return canfly;
    }

    public int getNumberOfLeg() {
        return numberofleg;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.type = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setCanfly(boolean canfly) {
        this.canfly = canfly;
    }

    public void setNumberofleg(int numberofleg) {
        try {
            if (numberofleg < 1)
                this.numberofleg = numberofleg;
            else
                System.out.println(" this must be a positive interger");
        } catch (Exception e) {
            System.out.println(" this must be a positive interger");
        }
    }
    public  void speaker(int times){
        for( int i = 0; i < times; i++){
            System.out.println(voice);
        }
    }
    public  void likeToImitateCat(){
        System.out.println("meow meow");
    }
    public void talkTo(Animal a2){
        System.out.println(name + ":" + voice +":");
        System.out.println(a2.name +":"+ a2.voice +":");

    }
    public boolean equal(Animal a2){
        if (type.equals(a2.getType()) && name.equals(a2.getName())){
            return true;
        }
        else {
            return false;
        }
    }
    public static Animal createAnimalInfo(){
        Animal pet = new Animal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Type: ");
        //String type1 = sc.nextLine();
        pet.setType(sc.nextLine());
        System.out.println("Name: ");
        //String name1 = sc.nextLine();
        pet.setName(sc.nextLine());
        System.out.println("Voice: ");
        //String  voice1= sc.nextLine();
        pet.setVoice(sc.nextLine());
        System.out.println("Canfly: ");
        //boolean canfly1=sc.nextBoolean();
        pet.setCanfly(sc.nextBoolean());
        System.out.println("Num of leg: ");
        //int numberofleg1=sc.nextInt();
//       Animal pet = new Animal (type1,name1,voice1,canfly1,numberofleg1);
        pet.setNumberofleg(Integer.parseInt(sc.nextLine()));
        return pet;
    }
    public String toString(){
        String info = type + ":" + name + ":"+ voice +":" + canfly+":" + numberofleg+":";
        return  info;
    }

}

