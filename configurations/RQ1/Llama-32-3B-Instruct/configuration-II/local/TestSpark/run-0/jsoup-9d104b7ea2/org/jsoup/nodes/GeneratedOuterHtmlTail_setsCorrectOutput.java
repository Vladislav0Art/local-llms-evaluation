package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_setsCorrectOutput {

    private TextNode textNode;

    @Test
    public void outerHtmlTail_setsCorrectOutput() {
        String originalText = "Hello World";
        Applicable appendable = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        textNode.setWholeText(originalText);
        document.outerHtml(appendable, 0, outputSettings);
        assertEquals("", appendable.toString());
    }

}