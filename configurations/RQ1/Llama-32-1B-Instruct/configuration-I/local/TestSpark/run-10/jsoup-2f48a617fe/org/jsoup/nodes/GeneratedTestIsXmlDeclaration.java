package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestIsXmlDeclaration {

    @Test
    public void testIsXmlDeclaration() {
        String xml = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";
        Element element = new Document().nodeByValue(xml);
        assertTrue(element.is.XmlDeclaration());
    }

    public static class Comment {
        private String data;

        public Comment(String data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "# " + data;
        }

        public String getData() {
            return data;
        }
    }

    public static class Document {
        public Element nodeByValue(String value) {
            // implementation of the method to find an element by its string value
            // this is a simplified example, you might need to use a real DOM parser library for this
            return new Element("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\"><html><head></head><body></body></html>");
        }
    }

}