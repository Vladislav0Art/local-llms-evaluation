package org.jsoup.nodes;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() {
        String encodedText = "Hello, World!";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals(originalText(node), encodedText);
    }
}

class LeafNodeTest {

    private TextNode node;

    @Before
    public void setup() {
        node = new TextNode("Hello, World!");
    }

    @After
    public void tearDown() {
    }

}