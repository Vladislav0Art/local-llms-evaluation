package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedLastCharIsWhitespace_LastCharacterIsWhitespaceCorrectly {

    @Test
    public void lastCharIsWhitespace_LastCharacterIsWhitespaceCorrectly() throws IOException {
        Document document = Jsoup.parse("<a>1<a><span>2</span></a><a>3</a>");
        String actualText = document.text();
        TextNode textNode = new TextNode(actualText);
        assertTrue(textNode.isBlank());
    }

    public class TextNode {

        private String text;

        public TextNode(String text) {
            this.text = text;
        }

        public boolean isBlank() {
            return text.trim().isEmpty();
        }

        public String getText() {
            return text;
        }
    }
}

public class IOException extends Exception {
}

}