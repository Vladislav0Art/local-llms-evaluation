package org.jsoup.nodes;

public class GeneratedTest {

    private StringBuilder string;

    public DocumentOutputSettings(StringBuilder string) {
        this.string = new StringBuilder(string.toString());
    }

    public static boolean lastCharIsWhitespace(StringBuilder builder, int length) {
        if (builder.length() > 0 && Character.isWhitespace(builder.charAt(length - 1))) {
            return true;
        } else {
            return false;
        }
    }

    public DocumentOutputSettings lastCharIsWhitespace(int length) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (!lastCharIsWhitespace(newString, i)) {
                newString.append(string.charAt(i));
            } else {
                break;
            }
        }
        return new DocumentOutputSettings(newString);
    }

    public static Document.OutputSettings lastCharIsWhitespace(OutputSettings settings) {
        StringBuilder newStringBuilder = new StringBuilder();
        for (int i = 0; i < ((StringBuilder) settings).toString().length(); i++) {
            if (!lastCharIsWhitespace(newStringBuilder, i)) {
                newStringBuilder.append(((StringBuilder) settings).charAt(i));
            } else {
                break;
            }
        }
        return new Document.OutputSettings(newStringBuilder);
    }

    public String getToString() {
        return string.toString();
    }
}

public class StringUtil {
    private StringBuilder builder;

    public StringUtil(StringBuilder builder) {
        this.builder = builder;
    }

    public String stripLeadingWhitespace() {
        int start = builder.indexOfFirstNonWhitespace();
        if (start == -1) return "";
        return builder.substring(start);
    }

    public static String stripLeadingWhitespace(String input) {
        StringBuilder newStringBuilder = new StringBuilder(input);
        int start = newStringBuilder.indexOfFirstNonWhitespace();
        if (start == -1) return "";
        newStringBuilder.deleteCharAt(start);
        return newStringBuilder.toString();
    }
}

public class OutputSettings {

}

public class Document {
    public static boolean lastCharIsWhitespace(StringBuilder builder, int length, OutputSettings settings) {
        if (builder.length() > 0 && Character.isWhitespace(builder.charAt(length - 1))) {
            return true;
        } else {
            return false;
        }
    }

    public static Document.OutputSettings lastCharIsWhitespace(OutputSettings settings) {
        StringBuilder newStringBuilder = new StringBuilder();
        for (int i = 0; i < ((StringBuilder) settings).toString().length(); i++) {
            if (!lastCharIsWhitespace(newStringBuilder, i, settings)) {
                newStringBuilder.append(((StringBuilder) settings).charAt(i));
            } else {
                break;
            }
        }
        return new Document.OutputSettings(newStringBuilder);
    }

    public OutputSettings getSettings() {
        return this.settings;
    }

    private OutputSettings settings;

    public Document(OutputSettings settings) {
        this.settings = settings;
    }

    public boolean lastCharIsWhitespace() {
        String s = getToString();
        if (lastCharIsWhitespace(s).getToString().length() > 0 && Character.isWhitespace(lastCharIsWhitespace(getSettings()).getToString().charAt(lastCharIsWhitespace(getSettings()).getSettings().getToString().length() - 1))) {
            return true;
        } else {
            return false;
        }
    }
}

public class TestDocument {

    @Test
    public void createTextNodeValidTextNotNull() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode.text());
    }

    @Test
    public void createTextNodeBlankTextNotNull() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode.text());
    }

    @Test
    public void getWholeTextEmptyText() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertEquals("", textNode.getWholeText());
    }

    @Test
    public void getWholeTextNonBlankText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World", textNode.getWholeText());
    }

    @Test
    public void splitTextPositiveOffsetNotNull() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(0);
        assertNotNull(result.text());
    }

    @Test
    public void splitTextNegativeOffsetNullResult() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNull(textNode.splitText(-1).text());
    }

    @Test
    public void isBlankEmptyTextTrue() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void outerHtmlTailEmptyTextNoAppend() {
        String text = "";
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = null;
        TextNode node = new TextNode(text);
        node.outerHtmlTail(accum, depth, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void outerHtmlTailNonEmptyTextAppend() {
        String text = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = null;
        TextNode node = new TextNode(text);
        node.outerHtmlTail(accum, depth, out);
        assertEquals("<p>Hello World</p>", accum.toString());
    }

}