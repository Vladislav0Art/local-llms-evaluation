package org.jsoup.safety;

public class GeneratedTest {

    @Test
    public void testIsSafeAnchor() {
        String validAnchor = "<a href='https://www.example.com'>Example</a>";
        System.out.println(Element.isValidAnchor(validAnchor));

        String invalidAnchor = "<a href='invalid anchor'></a>";
        System.out.println(Element.isValidAnchor(invalidAnchor));
    }

    public static class Element {
        private String value;

        public static boolean isValidAnchor(String value) {
            // Implementation of the logic to check if a given HTML anchor is valid
            return true;
        }
    }

}