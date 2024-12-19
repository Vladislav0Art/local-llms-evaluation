package org.jsoup.nodes;

public class GeneratedTestTextNodeStripLeadingWhitespace {

    @Test
    public void testTextNodeStripLeadingWhitespace() {
        StringBuilder builder = new StringBuilder();
        assertTrue(TextNode.stripLeadingWhitespace(builder.toString()).equals("Hello World"));
    }

}