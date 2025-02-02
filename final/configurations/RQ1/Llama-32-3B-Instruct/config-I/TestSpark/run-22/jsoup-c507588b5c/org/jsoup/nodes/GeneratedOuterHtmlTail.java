package org.jsoup.nodes;

public class GeneratedOuterHtmlTail {

    public TextNode testTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void outerHtmlTail() throws IOException {
        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(out);
        TextNode textNode = testTextNode("");
        textNode.outerHtmlTail(writer, 0, null);
        assertEquals("", out.toString().trim());
    }

}