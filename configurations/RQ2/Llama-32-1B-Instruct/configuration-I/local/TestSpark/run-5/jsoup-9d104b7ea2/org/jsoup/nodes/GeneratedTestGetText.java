package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetText {

    @Test
    public void testGetText() {
        // Create an ArrayList to store texts
        List<String> list = new ArrayList<>();

        // Append two strings into the ArrayList using append method
        list.add("Hello");
        list.add("World");

        // Get the last element in the ArrayList and return it as a string
        String text = list.get(list.size() - 1);
        System.out.println(text);  // prints "World"
    }

}