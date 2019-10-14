package Bike;

import java.util.Scanner;

public class Bike {
    public static void main(String[] args) {
        final int wheelsNeeded = 2;
        final int framesNeeded = 1;
        final int linksNeeded = 50;
        int wheels, frames, links,
                bikeFromWheels, bikeFromFrames, bikeFromLinks,
                numberOfBike,
                leftWheels, leftFrame, leftLinks;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many wheels do you have? ");
        wheels = scanner.nextInt();
        System.out.println("How many frames do you have? ");
        frames = scanner.nextInt();
        System.out.println("How many Links do you have? ");
        links = scanner.nextInt();
        bikeFromWheels = wheels / wheelsNeeded;
        bikeFromFrames = frames / framesNeeded;
        bikeFromLinks = links / linksNeeded;
        numberOfBike = Math.min(
                Math.min(bikeFromWheels,
                        bikeFromFrames),
                bikeFromLinks);
        System.out.println("ALL totalled up, " +
                "you've got " + numberOfBike + " bikes coming \n" +
                "I'm keeping the Leftovers for myself");
        leftWheels = wheels - numberOfBike * wheelsNeeded;
        leftFrame = frames - numberOfBike * framesNeeded;
        leftLinks = links - numberOfBike * linksNeeded;
        System.out.println("Leftovers: ");
        System.out.println(leftWheels + " wheels ");
        System.out.println(leftFrame + " frames ");
        System.out.println(leftLinks + " links ");


    }
}
