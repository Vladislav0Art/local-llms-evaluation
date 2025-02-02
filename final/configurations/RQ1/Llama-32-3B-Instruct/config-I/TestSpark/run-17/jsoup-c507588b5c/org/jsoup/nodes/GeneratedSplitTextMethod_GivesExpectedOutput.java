package org.jsoup.nodes;

public class GeneratedSplitTextMethod_GivesExpectedOutput {

    public static String normaliseWhitespace(String input) {
        // implementation of normalising whitespace
        return input.replaceAll("\\s+", " ");
    }
}

public class Document {
    public interface OutputSettings {
    }

    public static class OutputSettings implements OutputSettings {
    }
}

public class TextNode {
    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String text() {
        return text;
    }

    public void text(OutputStream out) throws IOException {
        // implementation of writing text to output stream
    }

    public boolean isBlank() {
        return text.isEmpty();
    }

    public TextNode splitText(int offset) {
        // implementation of splitting text at given offset
        return new TextNode(text.substring(offset));
    }

    public void outerHtmlHead(OutputStream out, int offset, OutputSettings settings) throws IOException {
        // implementation of writing HTML head to output stream
    }
}

public class GeneratedTest {

    @Test
    public void splitTextMethod_GivesExpectedOutput() throws IOException {
        String text = "Hello World";
        OutputStream out = new ByteArrayOutputStream();
        TextNode textNode = new TextNode(text);
        textNode.splitText(6).text(out);
        assertEquals("World", StringUtil.normaliseWhitespace(new String(out.toByteArray())));
    }

}