package org.jsoup.nodes;

public class GeneratedTestStripLeadingWhitespace {

    private TextNode node;
    private Document document;

    @Test
    public void testStripLeadingWhitespace() {
        String text = "   Hello   World!   ";
        node = new TextNode(text);
        assertEquals(13, text.length());
        assertEquals("Hello World!", stripLeadingWhitespace(text));
    }

}