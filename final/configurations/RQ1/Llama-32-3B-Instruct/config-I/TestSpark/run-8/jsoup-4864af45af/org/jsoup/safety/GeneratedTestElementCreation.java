package org.jsoup.safety;

public class GeneratedTestElementCreation {

    @Test
    public void testElementCreation() {
        String html = "<a href='https://www.example.com'>Example</a>";
        Document document = Jsoup.parse(html);
        Element element = new Element(document);
        System.out.println(element);
    }

    public static class Element {
        private String value;

        public Element(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Element{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }

    public static class DocumentUtils {
        public static boolean isValidAnchor(String anchor) {
            // Implementation of the logic to check if a given HTML anchor is valid
            return true;
        }
    }

}