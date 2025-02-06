package org.jsoup.nodes;

public class GeneratedClone_ReturnsSameInstance {

    @Test
    public void clone_ReturnsSameInstance() {
        TextNode node = new TextNode("test");
        assert node == node.clone();
    }

}