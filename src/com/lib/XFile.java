package com.lib;

import CandidateManager.Candidate;
import lab3.Exercise1.Animal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class XFile {
    public static void writeFile(String path) {
        File file = new File(path);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            byte[] arr = {10,20,30};
            fos.write(arr);
            fos.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    public static void readFile(String path) {
        File file = new File(path);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            int fileSize = (int) file.length();
            byte[] arr = new byte[fileSize];
            fis.read(arr);
            for(int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            fis.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }


    public static void writeDataFile(String path){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(5);
            dos.writeUTF("Huỳnh Văn Ngoãn");
            dos.writeDouble(8.7);
            dos.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public static void readDataFile(String path){
        try {
            FileInputStream fis = new FileInputStream(path);
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());
            dis.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void writeBuffer(String path, String text, String text1) {
        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.write(text1);
            bw.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public static String readBuffer(String path) {
        StringBuilder sb = new StringBuilder();
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine(); //first line
            while (str != null){
                sb.append(str);
                str= br.readLine();
                if(str != null) sb.append("\n");
            }
            br.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        return sb.toString();
    }

    public static void writeObject(String path, Object o) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(o);
            oos.close();
        }catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static Object readObject(String path) {
        try {
            ObjectInputStream ois = new ObjectInputStream (new FileInputStream(path));
            Object o = ois.readObject();
            ois.close();
            return o;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public static void main(String[] args) {
//        String filePath = "testAnimal.dat";
//        String text = "Hello World \nMy name is Cat";
//        writeBuffer(filePath, text);
//        System.out.println(readBuffer(filePath));
//        writeDataFile(filePath);
//        readDataFile(filePath);
//        writeFile(filePath);
//        readFile(filePath);
//        List<Animal> lst = new ArrayList<>();
//        lst.add(new Animal("Dog", "Bobby"));
//        lst.add(new Animal("Cat", "Chicken"));
//        lst.add(new Animal("Chicken", "Hen"));
//        writeObject(filePath, lst);
//        List<Animal> newLst = (List<Animal>) readObject(filePath);
//        for (Animal a : newLst) {
//            System.out.println(a.getName());
//        }
        String filePath = "Candidate.dat";
        List<Candidate> lstCan = new ArrayList<>();
        writeObject(filePath, lstCan);
    }
}
