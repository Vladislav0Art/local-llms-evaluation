package org.jsoup.nodes;

public class GeneratedCloneMethodTest {

    @Test
    public void cloneMethodTest() {
        TextNode node = new TextNode("test");
        TextNode cloned = node.clone();
        assertEquals(node, cloned);
    }

}