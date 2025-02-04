package org.jsoup.nodes;

public class GeneratedCreateFromEncodedMethodTest {

    @Test
    public void createFromEncodedMethodTest() {
        String encodedText = "&lt;test&gt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("<test>", node.text());
    }

}