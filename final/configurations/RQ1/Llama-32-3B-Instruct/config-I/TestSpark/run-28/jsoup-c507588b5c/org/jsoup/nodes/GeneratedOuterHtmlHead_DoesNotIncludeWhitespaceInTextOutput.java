package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_DoesNotIncludeWhitespaceInTextOutput {

    @Test
    public void outerHtmlHead_DoesNotIncludeWhitespaceInTextOutput() {
        String rawText = "\n   \t";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, true);
        TextNode textNode = new TextNode(rawText);
        try {
            textNode.outerHtmlHead(accum, 0, out);
            assertEquals("Hello World!", accum.toString());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

}