package org.jsoup.nodes;

public class Generated[TextNode]

splitTextTest {

    @Test
    public void [TextNode]splitTextTest() {
        TextNode node = new TextNode("Hello World");
        assertEquals(5, node.splitText(0).text().length());
        assertEquals(3, node.splitText(1).text().length());
    }

}