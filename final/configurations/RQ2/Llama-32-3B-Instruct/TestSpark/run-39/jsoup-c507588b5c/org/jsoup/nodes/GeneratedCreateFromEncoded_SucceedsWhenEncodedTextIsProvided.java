package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_SucceedsWhenEncodedTextIsProvided {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello, World!");
    }

    @Test
    public void createFromEncoded_SucceedsWhenEncodedTextIsProvided() {
        TextNode newNode = TextNode.createFromEncoded("   Hello,\nWorld!\t  ");
        assertNotNull(newNode);
        assertEquals("", newNode.getWholeText());
    }

}