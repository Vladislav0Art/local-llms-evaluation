package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_GivenTextNode_ThrowsIOException {

    @Test
    public void outerHtmlTail_GivenTextNode_ThrowsIOException() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        TextNode textNode = new TextNode("test node");
        textNode.outerHtmlTail(accum, 0, null);
        assertNotEquals(null, textNode);
    }

}