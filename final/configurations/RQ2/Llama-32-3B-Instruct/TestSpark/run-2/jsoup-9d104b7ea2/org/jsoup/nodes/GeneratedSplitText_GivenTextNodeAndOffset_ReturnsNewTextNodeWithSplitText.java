package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedSplitText_GivenTextNodeAndOffset_ReturnsNewTextNodeWithSplitText {

    @Test
    public void splitText_GivenTextNodeAndOffset_ReturnsNewTextNodeWithSplitText() throws IOException {
        String originalText = "Hello, World!";
        int offset = 7;
        String expectedText = "World!";
        TextNode textNode = new TextNode(originalText);
        TextNode newText = textNode.splitText(offset);
        assertEquals(expectedText, newText.text());
    }

    public static class TextNode {
        private String text;

        public TextNode(String text) {
            this.text = text;
        }

        public boolean isBlank() {
            return this.text.isEmpty();
        }

        public void splitText(int offset) {
            // implementation
        }

        @Override
        public String toString() {
            return this.text;
        }
    }

}