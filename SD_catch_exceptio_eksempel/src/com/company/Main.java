package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] parts = s.split(" ");

        String color = parts[0];
        int position = Integer.parseInt(parts[1]);


    }

    private String[] colors = new String[6];


    public void addColor(int position, String color) throws Exception {
        if (colors[position] == null()){}

        colors[position] = color;


        throw new Exception("Position  already occupied");
    }
}
