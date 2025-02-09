package org.jsoup.nodes;

public class GeneratedClone_SucceedsWhenCloneIsNotNull {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello, World!");
    }

    @Test
    public void clone_SucceedsWhenCloneIsNotNull() {
        assertNotNull(clone);
        assertEquals(node.text(), clone.text());
    }

}