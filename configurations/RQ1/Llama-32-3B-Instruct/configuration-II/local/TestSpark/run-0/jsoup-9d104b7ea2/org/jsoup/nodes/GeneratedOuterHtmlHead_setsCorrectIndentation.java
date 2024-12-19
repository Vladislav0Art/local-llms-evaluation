package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_setsCorrectIndentation {

    private TextNode textNode;

    @Test
    public void outerHtmlHead_setsCorrectIndentation() {
        String originalText = "     Hello\nWorld";
        Applicable appendable = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        textNode.setWholeText(originalText);
        document.outerHtml(appendable, 0, outputSettings);
        assertEquals("<p>   Hello<br>World</p>", appendable.toString());
    }

}