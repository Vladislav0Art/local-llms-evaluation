package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_setsCorrectOutput {

    private TextNode textNode;

    @Test
    public void outerHtmlHead_setsCorrectOutput() {
        String originalText = "Hello World";
        Applicable appendable = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        textNode.setWholeText(originalText);
        document.outerHtml(appendable, 0, outputSettings);
        assertEquals("Hello World", appendable.toString());
    }

}