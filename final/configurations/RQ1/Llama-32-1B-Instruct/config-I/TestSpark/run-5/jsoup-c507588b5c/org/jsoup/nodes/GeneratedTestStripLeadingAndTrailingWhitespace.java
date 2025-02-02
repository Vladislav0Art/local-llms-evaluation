package org.jsoup.nodes;

public class GeneratedTestStripLeadingAndTrailingWhitespace {

    @Test
    public void testStripLeadingAndTrailingWhitespace() {
        String text = "   \n\t\r\n";
        TextNode node = new TextNode(text);
        assertEquals("Hello World!", node.text(""));
    }

}