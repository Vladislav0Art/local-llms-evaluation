package org.jsoup.nodes;

public class GeneratedTestClone {

    private TextNode node;

    @Before
    public void setup() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testClone() {
        TextNode clone = (TextNode) node.clone();
        assertNotNull(clone);
        assertEquals(node.getText(), clone.getText());
    }

}