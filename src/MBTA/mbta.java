package MBTA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mbta {

    public mbta() {

    }

    /**
     * RED_LINE
     *
     * @return The list of valid stations
     */
    public List<String> RED_LINE() {
        return new ArrayList<String>(List.of("Ashmont", "Shawmut", "Fields Corner", "Savin Hill", "JFK/UMass", "Andrew", "Broadway", "South Station",
                "Downtown Crossing", "Park St", "Charles/MGH", "Kendall", "Central", "Harvard", "Porter", "Davis",
                "Alewife"));

    }

    /**
     * is_valid_station
     *
     * @param station_name, a string
     * @return boolean, True if station is in the red line, False otherwise
     */
    public boolean is_valid_station(String station_name) {
        // List of string contains a station name
        return RED_LINE().contains(station_name);
//        // Array of string contains a station name
//        for (int i = 0; i < RED_LINE().length; i++) {
//            if (RED_LINE()[i].equals(station_name)) {
//                return true;
//            }
//        }
//        return false;

    }

    /**
     * get_direction
     *
     * @param start_station, strings
     * @param end_station,   strings
     * @return first stop or last stop on the red line.
     * i.  If either station doesn’t exist on the red line, return the string ​"no destination found"​.
     * ii. If both stations are the same, return ​"no destination found"
     */
    public String get_direction(String start_station, String end_station) {
        if (!RED_LINE().contains(start_station) || !RED_LINE().contains(end_station)) {
            return "no destination found";
        } else if (start_station.equals(end_station)) {
            return "both stations are the same";
        } else if (RED_LINE().indexOf(end_station) - RED_LINE().indexOf(start_station) > 0) {
            return "Alewife";
        } else {
            return "Ashmont";
        }
//        // Access the index of array element.
//        int start_station_index = 0;
//        for (int index = 0; index < RED_LINE().length; index++) {
//            if (RED_LINE()[index].equals(start_station)) {
//                start_station_index = index;
//
//            }
//        }
//
//        // Access the index of array element.
//        int end_station_index = 0;
//        for (int index = 0; index < RED_LINE().length; index++) {
//            if (RED_LINE()[index].equals(end_station)) {
//                end_station_index = index;
//            }
//        }
//
//
//        if (end_station_index - start_station_index > 0) {
//            return "Alewife";
//        } else if (end_station_index - start_station_index < 0) {
//            return "Ashmont";
//        } else if (start_station.equals(end_station)) {
//            return "both stations are the same";
//        }
//
//        for (int i = 0; i < RED_LINE().length; i++) {
//            if ((!RED_LINE()[i].equals(start_station)) || (!RED_LINE()[i].equals(end_station))) {
//                return "no destination found";
//            }
//        }
//        return "";
    }

    /**
     * get_num_stops
     *
     * @param start_station, string
     * @param end_station,   string
     * @return number of stops from start to end, a positive integer.
     * If either station doesn’t exist on the red line, or if both stations are the same, return 0
     */
    public int get_num_stops(String start_station, String end_station) {
        if (!RED_LINE().contains(start_station) || !RED_LINE().contains(end_station)){
            return 0;
        }
        else if (start_station.equals(end_station)){
            return 0;
        }
        else {
            return Math.abs(RED_LINE().indexOf(end_station) - RED_LINE().indexOf(start_station));
        }


    }

}
