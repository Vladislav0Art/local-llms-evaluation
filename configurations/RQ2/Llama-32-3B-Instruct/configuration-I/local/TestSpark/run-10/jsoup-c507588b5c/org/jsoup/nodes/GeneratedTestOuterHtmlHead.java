package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private String text;

    public static TextNode createFromEncoded(String encoded) {
        return new TextNode(encoded);
    }

    public void text(String newText) {
        this.text = newText;
    }

    public String getWholeText() {
        return text;
    }

    public boolean isBlank() {
        return text.isEmpty();
    }

    public static StringBuilder outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws Exception {
        // implementation of outerHtmlHead method here
        return null;
    }
}

public class TextNodeTest {

    @Test
    public void testOuterHtmlHead() throws Exception {
        TextNode node = new TextNode();
        Appendable accum = new StringBuilder();  // fix: use StringBuilder instead of Appendable
        Document.OutputSettings out = new Document.OutputSettings();  // fix: create a new instance of Document.OutputSettings
        try {
            node.outerHtmlHead(accum, 1, out);
            fail("Exception not thrown");
        } catch (Exception e) {
        }
    }

}