package org.jsoup.nodes;

public class GeneratedNewNodeFromEncodedCreatesTextNodeCorrectly {

    @Test
    public void newNodeFromEncodedCreatesTextNodeCorrectly() {
        String encodedText = "&lt;Hello&gt; &amp; World! &lt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello, World!", node.text());
    }

}