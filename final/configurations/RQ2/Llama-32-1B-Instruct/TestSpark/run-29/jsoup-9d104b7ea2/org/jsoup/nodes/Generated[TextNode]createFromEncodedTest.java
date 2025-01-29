package org.jsoup.nodes;

public class Generated[TextNode]

createFromEncodedTest {

    @Test
    public void [TextNode]createFromEncodedTest() {
        String encodedText = "Hello World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello World", node.text());
    }

}