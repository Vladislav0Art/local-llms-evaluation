package org.jsoup.nodes;

public class GeneratedSplitText_SplittingAtOffset_ReturnsNewTextNode {

    private String text;

    public TextNode() {
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getWholeText() {
        return text;
    }
}

public class GeneratedTest {

    @Test
    public void splitText_SplittingAtOffset_ReturnsNewTextNode() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode();
        textNode.setText(text);
        assertEquals("World!", textNode.splitText(text.length()).getWholeText());
    }
}

public class Document {
    public static class OutputSettings {
    }

    public static class Appendable extends java.io.Appendable {

        @Override
        public void append(String value) throws IOException {
            // implement append logic
        }

        @Override
        public void append(CharSequence csq, int start, int end) throws IOException {
            // implement append logic
        }
    }

}