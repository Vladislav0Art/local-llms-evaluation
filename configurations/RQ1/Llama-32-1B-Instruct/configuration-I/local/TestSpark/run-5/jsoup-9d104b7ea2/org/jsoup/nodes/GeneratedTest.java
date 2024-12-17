package org.jsoup.nodes;

public class GeneratedTest {

    private static String html = "<p>  Hello World  </p>";

    @Test
    public void testIsBlank() {
        assertTrue(TextNode.isBlank(html));
        assertEquals(" ", TextNode.getText(html));
    }

    @Test
    public void testSplitText() {
        TextNode root = new TextNode(html);
        TextNode node1 = root.splitText(10);
        String expectedText = "Hello World";
        assertEquals(expectedText, node1.getText());
    }

    @Test
    public void testOuterHtmlHead() {
        Document document = new Document();
        Appendable accum = document.newAppendable();

        outerHtmlHead(accum, 0, document.OutputSettings());

        assertEquals("<p>Hello World</p>", StringUtil.stripLines(accum.toString()));
    }

    @Test
    public void testOuterHtmlTail() {
        Document document = new Document();
        Appendable accum = document.newAppendable();

        outerHtmlTail(accum, 0, document.OutputSettings());

        assertEquals("<p>Hello World</p>", StringUtil.stripLines(accum.toString()));
    }

    @Test
    public void testGetText() {
        TextNode root = new TextNode(html);
        assertEquals("Hello World", root.getText());
    }

}