package org.jsoup.nodes;

public class GeneratedTestLastCharIsWhitespace {

    @Test
    public void testLastCharIsWhitespace() throws IOException, Exception {
        StringBuilder sb = new StringBuilder();
        TextNode node = new TextNode(sb.toString());
        assertTrue(node.lastCharIsWhitespace(sb));
    }

}