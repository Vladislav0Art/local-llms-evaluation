package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        TextNode textNode = new TextNode("some text");
        StringWriter writer = new StringWriter();
        textNode.outerHtmlHead(writer, 0, new Document.OutputSettings());
        assertEquals("some text", writer.toString());
    }

}