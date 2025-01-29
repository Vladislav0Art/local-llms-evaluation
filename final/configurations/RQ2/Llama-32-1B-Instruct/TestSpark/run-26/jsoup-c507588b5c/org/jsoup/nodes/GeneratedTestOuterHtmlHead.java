package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        TextNode node = new TextNode("Hello World");
        String expectedOutput = "<p>Hello World</p>";
        assertEquals(expectedOutput, node.outerHtmlHead(Appendable.EMPTY, 1, Document.OutputSettings.INDENT));

        // Test with Appendable.empty
        TextNode emptyNode = new TextNode("");
        assertEquals("", node.outerHtmlHead(Appendable.EMPTY, 1, Document.OutputSettings.INDENT));
    }

}