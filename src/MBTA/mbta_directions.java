package MBTA;

import java.util.Scanner;

public class mbta_directions {
    public static void main(String[] args) {
        var mbta = new mbta();
        // Gather and validate input (user provides names of start/end stations)
        // Assumption: User is not transferring.
        System.out.println("Enter a starting T station \n");
        Scanner scanner = new Scanner(System.in);
        String start_station = scanner.nextLine();
        while (!mbta.is_valid_station(start_station)) {
            System.out.println("I've never heard of that station, please enter again \n");
            start_station = scanner.nextLine();
        }

        System.out.println("Enter your destination T station \n");
        String end_station = scanner.nextLine();
        while (!mbta.is_valid_station(end_station)) {
            System.out.println("I've never heard of that station, please enter again \n");
            end_station = scanner.nextLine();
        }

        // Figure out the direction to go on that line (final station
        // in the direction from start to end).
        String direction = mbta.get_direction(start_station, end_station);
        int num_stops = mbta.get_num_stops(start_station, end_station);

        if (num_stops == 0) {
            System.out.println(start_station +
                    " to " +
                    end_station +
                    "? " +
                    "I can't help you with that one! ");

        } else {
            System.out.println("Get on at " +
                    start_station +
                    " toward " +
                    direction +
                    ".\n" +
                    "Take the train for " +
                    num_stops +
                    " " +
                    "stops and arrive at " +
                    end_station +
                    ".");
        }


    }
}
