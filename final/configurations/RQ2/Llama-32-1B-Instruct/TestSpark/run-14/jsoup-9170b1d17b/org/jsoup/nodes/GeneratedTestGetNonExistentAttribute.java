package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestGetNonExistentAttribute {

    public static Document generateDocument(String html) {
        // Simulate rendering the HTML document
        Document document = new Document();
        Elements elements = document.createElement("html").appendChild(document.createNode("body"));
        Element head = document.createElement("head");
        document.appendChild(head);
        element = document.createElement("title");
        element.text = "My Service Test";
        head.appendChild(element);

        elements = document.createElement("script")
                .appendChild(document.createTextNode("console.log('Hello World!');"))
                .appendChild(document.createElement("style"))
                .appendChild(document.createTextNode(".attribute { color: red; }"));
        elements.appendChild(head);
        return document;
    }

    @Test
    public void testGetNonExistentAttribute() {
        String html = "<html><head><title>My Service Test</title></head><body><script>alert('Hello World!');</script></body></html>";
        Document document = generateDocument(html);

        MyService service = new MyService();
        element = document.getElementById("element");
        try {
            service.getAttribute("nonExistentAttr");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Ignore
        }
    }

    public static class Attr {

        private String key;
        private String value;

        public Attr(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Attr that = (Attr) o;
            return Objects.equals(key, that.key) && Objects.equals(value, that.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }

    public static class MyService {

        private Attr attribute;

        public void addAttribute(Attr attribute) {
            this.attribute = attribute;
        }

        public boolean hasAttribute(String key) {
            return attribute.getKey().equals(key);
        }

        public String getAttribute(String key) {
            return attribute.getValue();
        }
    }

}