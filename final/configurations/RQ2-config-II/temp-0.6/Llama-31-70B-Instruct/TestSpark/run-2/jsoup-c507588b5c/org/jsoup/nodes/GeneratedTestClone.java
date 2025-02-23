package org.jsoup.nodes;

public class GeneratedTestClone {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode("Some text");
    }

    @Test
    public void testClone() {
        TextNode clone = textNode.clone();

        assertNotSame(textNode, clone);
        assertEquals(textNode.getWholeText(), clone.getWholeText());
    }

}