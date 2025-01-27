package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_Test {

    private TextNode node;

    @Before
    public void setup() {
        this.node = new TextNode("Hello, World!");
    }

    /**
     * [nodeName]Test
     */

    @Test
    public void createFromEncoded_Test() {
        TextNode textNode = TextNode.createFromEncoded("%s");
        assertEquals("Hello, World!", textNode.text());

        String encodedText = "%C2%A1%C3%BC%C3%BC";
        assertTrue(TextNode.createFromEncoded(encodedText).text().equals(encodedText));
    }

}