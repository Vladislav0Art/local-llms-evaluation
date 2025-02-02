package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_GivenTextNode_IndentsProperly {

    @Test
    public void outerHtmlHead_GivenTextNode_IndentsProperly() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        TextNode textNode = new TextNode("  indent me ");
        TextNode testNode = new TextNode("non indented");
        document.appendChild(testNode);
        document.appendChild(textNode);
        textNode.outerHtmlHead(accum, 0, null);
        assertTrue(accum.toString().contains("<p><span>indent me </span></p>"));
    }

}