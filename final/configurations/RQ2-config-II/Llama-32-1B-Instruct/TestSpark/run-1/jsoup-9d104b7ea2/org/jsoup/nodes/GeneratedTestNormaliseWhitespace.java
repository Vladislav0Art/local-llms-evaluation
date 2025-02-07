package org.jsoup.nodes;

public class GeneratedTestNormaliseWhitespace {

    private TextNode node;
    private Document document;

    @Test
    public void testNormaliseWhitespace() {
        String text = "   Hello   World!   ";
        node = new TextNode(text);
        assertEquals("Hello World", normaliseWhitespace(text));
    }

}