package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadMethod_GivesExpectedOutput {

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
    public void outerHtmlHeadMethod_GivesExpectedOutput() throws IOException {
        String htmlHead = "<head>Hello World</head>";
        OutputStream out = new ByteArrayOutputStream();
        TextNode textNode = new TextNode(htmlHead);
        Document.OutputSettings settings = new Document.OutputSettings();
        textNode.outerHtmlHead(out, 0, settings);
        assertEquals("<head>Hello World</head>", StringUtil.normaliseWhitespace(new String(out.toByteArray())));
    }
}

public class OutputStream extends java.io.OutputStream {
    private byte[] buffer = new byte[1024];

    public OutputStream(byte[] buffer) {
        this.buffer = buffer;
    }

    @Override
    public void write(int b) throws IOException {
        buffer[bufferIndex++] = (byte) b;
    }

    public byte[] toByteArray() {
        return Arrays.copyOf(buffer, bufferIndex);
    }
}

public class ByteArrayOutputStream extends OutputStream {
    private byte[] buffer = new byte[1024];

    @Override
    public void write(int b) throws IOException {
        buffer[bufferIndex++] = (byte) b;
    }

    public byte[] toByteArray() {
        return Arrays.copyOf(buffer, bufferIndex);
    }

}