package org.jsoup.nodes;

public class GeneratedClone_isSameInstance {

    @Test
    public void clone_isSameInstance() {
        TextNode node = new TextNode("text");
        TextNode cloned = node.clone();
        Assert.assertEquals(node, cloned);
    }

}