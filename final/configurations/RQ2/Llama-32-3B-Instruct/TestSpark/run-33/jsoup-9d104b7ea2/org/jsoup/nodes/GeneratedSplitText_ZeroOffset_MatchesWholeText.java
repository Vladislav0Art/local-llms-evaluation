package org.jsoup.nodes;

public class GeneratedSplitText_ZeroOffset_MatchesWholeText {

    @Test
    public void splitText_ZeroOffset_MatchesWholeText() throws IOException {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals(text, node.splitText(0).text());
    }

}