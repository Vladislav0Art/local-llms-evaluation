package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testIsBlank() {
        assertEquals(false, TextNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test  \n\n");
        TextNode result = textNode.splitText(0);
        assertEquals(new TextNode("test\n\n"), result);
    }

    @Test
    public void testOuterHtmlHead() {
        Document doc = new Document();
        Appendable accum = new StringBuilder();
        Assert.assertTrue(TextNode.outerHtmlHead(accum, 1, null).equals(doc.outerHtml()));
    }

    @Test
    public void testClone() {
        TextNode textNode = new TextNode("test");
        TextNode clonedTextNode = textNode.clone();
        assertEquals(textNode, clonedTextNode);
    }

}