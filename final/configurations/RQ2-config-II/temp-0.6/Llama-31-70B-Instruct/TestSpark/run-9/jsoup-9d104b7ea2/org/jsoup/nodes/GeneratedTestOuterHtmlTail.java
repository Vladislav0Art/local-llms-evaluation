package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() throws IOException {
        TextNode textNode = new TextNode("some text");
        StringWriter writer = new StringWriter();
        textNode.outerHtmlTail(writer, 0, new Document.OutputSettings());
        assertEquals("", writer.toString());
    }

}