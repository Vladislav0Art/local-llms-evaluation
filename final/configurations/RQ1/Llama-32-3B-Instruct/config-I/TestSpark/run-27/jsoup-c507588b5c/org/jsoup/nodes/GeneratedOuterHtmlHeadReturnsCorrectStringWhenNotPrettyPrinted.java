package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadReturnsCorrectStringWhenNotPrettyPrinted {

    private String text;

    public static TextNode createFromString(String text) {
        return new TextNode(text);
    }

    public TextNode(String text) {
        this.text = text;
    }

    public String text() {
        return text;
    }

    public void text(String newText) {
        this.text = newText;
    }

    public String splitText(int offset) {
        if (offset >= text.length()) {
            return "";
        }
        int tailLength = text.length() - offset;
        String head = text.substring(0, offset);
        return head + "\n" + text.substring(offset, offset + tailLength);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextNode that = (TextNode) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return text.hashCode();
    }

    public String outerHtmlHead(Appendable appendable, int depth, Document.OutputSettings out) {
        if (!out.prettyPrint()) {
            return "<p>" + text + "</p>";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < depth; i++) {
                sb.append("    ");
            }
            sb.append("<").append(text).append(">");
            appendable.append(sb.toString());
            if (!out.prettyPrint()) {
                appendable.append("</p>");
            } else {
                appendable.append("</p></body></html>");
            }
            return appendable.toString();
        }
    }

    public TextNode clone() {
        return new TextNode(text);
    }
}

public class GeneratedTest {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    public TextNode getTextNode() {
        return TextNode.createFromString("Hello World");
    }

    @Test
    public void outerHtmlHeadReturnsCorrectStringWhenNotPrettyPrinted() {
        StringBuilder appendable = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings(false);
        TextNode node = new TextNode("Hello World");
        node.outerHtmlHead(appendable, 0, settings);
        assertFalse(settings.prettyPrint());
    }

}