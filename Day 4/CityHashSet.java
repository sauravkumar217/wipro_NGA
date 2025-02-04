import java.util.HashSet;

public class CityHashSet {
    public static void main(String[] args) {
        // Create a HashSet to store city names
        HashSet<String> cities = new HashSet<>();

        // Add five city names to the set, including a duplicate entry
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bengaluru");
        cities.add("Kolkata");
        cities.add("Mumbai"); // Duplicate entry

        // Display the elements to show that duplicates are not allowed
        System.out.println("Cities in the HashSet:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Check if a particular city exists in the set
        String cityToFind = "Bengaluru";
        if (cities.contains(cityToFind)) {
            System.out.println(cityToFind + " is in the HashSet.");
        } else {
            System.out.println(cityToFind + " is not in the HashSet.");
        }

        // Remove a city and display the updated set
        String cityToRemove = "Kolkata";
        cities.remove(cityToRemove);
        System.out.println("Updated HashSet after removing " + cityToRemove + ":");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
