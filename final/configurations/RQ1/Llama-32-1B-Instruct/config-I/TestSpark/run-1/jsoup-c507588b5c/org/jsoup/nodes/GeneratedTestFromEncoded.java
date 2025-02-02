package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.mockito.Mockito.*;

public class GeneratedTestFromEncoded {

    @Test
    public void testFromEncoded() {
        String encodedText = "Hello &lt; World";
        TextNode node = new TextNode(fromEncoded(encodedText));
        when(nodeGetWholeText()).thenReturn(encodedText);
        outerHtmlHead(appendable:mock(Element.class), depth:1, outputSettings:doc.outputSettings());
        verify(appendable).addChildren();
    }

    private boolean nodeIsBlank(Document doc) {
        return doc.outerHtml().split("\n\n").length <= 2;
    }

    private String nodeGetWholeText() {
        Document doc = mock(Document.class);
        outerHtmlHead(appendable:mock(Element.class), depth:1, outputSettings:doc.outputSettings());
        return doc.outerHtml();
    }

    private TextNode nodeSplitText(int index, Document doc) {
        return new TextNode(doc.outerHtml().substring(index));
    }

    private void outerHtmlHead(appendable appendable, int index, OutputSettings outputSettings) {
        appendable.addChildren("  <p>Hello</p>  <p></p>");
        appendable.addChildren();
    }

    private void outerHtmlTail(appendable appendable, int index, OutputSettings outputSettings) {
        appendable.removeChildren();
    }

    private String nodeToString(Document doc) {
        return doc.outerHtml().replaceAll("  +", " ");
    }

}