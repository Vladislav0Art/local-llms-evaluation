package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedOuterHtmlHeadAndTailIsCorrectTest {

    @Test
    public void outerHtmlHeadAndTailIsCorrectTest() throws IOException {
        // Create a new Document object
        Document document = new Document();

        // Create an HTML paragraph with leading and trailing whitespace.
        Element paragraph = document.createElement("p");
        String text = "   Hello World   ";
        Text node = new TextNode(text);
        paragraph.appendChild(node);
        document.body().appendChild(paragraph);

        // Assert that the resulting HTML is correct
        assertEquals("<p>   Hello World   </p>", document.body().html());
    }

    public static class TextNode {

        private final String text;

        public TextNode(String text) {
            this.text = text;
        }

        public String normaliseWhitespace() {
            return text.replaceFirst("\\s+", " ");
        }

        public String stripLeadingWhitespace() {
            int index = 0;
            while (index < text.length() && Character.isWhitespace(text.charAt(index))) {
                index++;
            }
            return text.substring(index);
        }

        public boolean lastCharIsWhitespace() {
            return Character.isWhitespace(text.charAt(text.length() - 1));
        }
    }

    @org.junit.Test
    public void testNormaliseWhitespace() {
        TextNode node = new TextNode("   Hello World   ");
        String expected = "Hello World";
        assertEquals(expected, node.normaliseWhitespace());
    }

    @org.junit.Test
    public void testStripLeadingWhitespace() {
        TextNode node = new TextNode("   Hello World   ");
        String expected = " Hello World ";
        assertEquals(expected, node.stripLeadingWhitespace());
    }

    @org.junit.Test
    public void testLastCharIsWhitespace() {
        TextNode node = new TextNode("   Hello World   ");
        boolean expected = false;
        assertNotEquals(expected, node.lastCharIsWhitespace());
    }

}