package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("   ");
        assertTrue(node.isBlank());
        TextNode node2 = new TextNode("Hello");
        assertFalse(node2.isBlank());
    }

    @Test
    public void testSplitText() {
        String text = "hello world";
        TextNode node = new TextNode(text);
        TextNode result1 = node.splitText(0);
        TextNode result2 = node.splitText(7);

        assertEquals("hello", result1.text());
        assertEquals("world", result2.text());
    }

    @Test
    public void testOuterHtmlHead() {
        String text = "<p>Hello</p>";
        Document document = new Document();
        Appendable accum = document.append(null, 0);
        outerHtmlHead(accum, 0, document.OutputSettings.PRETTY_PRINT);

        assertEquals("<p>Hello</p>", getInnerText(document, null));
    }

    @Test
    public void testOuterHtmlTail() {
        String text = "<p>Hello</p>";
        Document document = new Document();
        Appendable accum = document.append(null, 0);
        outerHtmlHead(accum, 0, document.OutputSettings.PRETTY_PRINT);

        assertEquals("<p>Hello</p>", getInnerText(document, null));
    }

    @Test
    public void testClone() {
        TextNode node = new TextNode("Hello");
        String cloneText = node.clone().text();
        assertTrue(cloneText.contains("Hello"));
    }

    private String getInnerText(Document document, Appendable accum) {
        for (int i = 0; i < document.bodyNodes().size(); i++) {
            Node child = document.bodyNodes().get(i);
            appendStringToAccum(accum, child.toString());
        }
        return String.valueOf(accum.toString());
    }

    private void appendStringToAccum(Appendable accum, String str) {
        if (str.length() > 0) {
            accum.append(str.charAt(0));
            for (char c : str.substring(1).toCharArray()) {
                appendStringToAccum(accum, String.valueOf(c));
            }
        }
    }

}