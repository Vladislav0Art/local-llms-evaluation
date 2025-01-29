package org.jsoup.nodes;

public class GeneratedTestLastCharIsWhitespaceStringBuilder {

    @Test
    public void testLastCharIsWhitespaceStringBuilder() {
        TextNode node = new TextNode("Hello");
        StringBuilder sb = new StringBuilder();
        lastCharIsWhitespace(sb);
        assertEquals(true, sb.length() > 0);

        sb.setLength(0);
        lastCharIsWhitespace(sb);
        assertEquals(false, sb.length() > 0);
    }

}