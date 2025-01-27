package org.jsoup.nodes;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("");
        TextNode cloned = node.clone();
        assertNotNull(cloned);
    }

}