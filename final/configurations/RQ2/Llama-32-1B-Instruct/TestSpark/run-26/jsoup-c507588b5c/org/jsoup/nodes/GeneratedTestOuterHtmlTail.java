package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        TextNode node = new TextNode("Hello World");
        String expectedOutput = "<p>Hello World</p>";
        assertEquals(expectedOutput, node.outerHtmlTail(Appendable.EMPTY, 1, Document.OutputSettings.INDENT));

        // Test with Appendable.empty
        TextNode emptyNode = new TextNode("");
        assertEquals("", node.outerHtmlTail(Appendable.EMPTY, 1, Document.OutputSettings.INDENT));
    }

}