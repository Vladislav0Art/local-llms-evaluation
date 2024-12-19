package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetTextAndAppend {

    @Test
    public void testGetTextAndAppend() {
        // Create an ArrayList to store texts
        List<String> list = new ArrayList<>();

        // Append two strings into the ArrayList using append method
        list.add("Hello");
        list.add("World");

        // Get the last element in the ArrayList and return it as a string
        String text = list.get(list.size() - 1);
        System.out.println(text);  // prints "World"

        // Append another string into the ArrayList using append method
        list.add("Java");

        // Print the contents of the ArrayList after appending two strings using append method
        for (String text : list) {
            System.out.print(text + " ");
        }
    }

}