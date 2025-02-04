package org.jsoup.nodes;

public class GeneratedTextNodeClone_test {

    @Test
    public void textNodeClone_test() {
        final TextNode node = new TextNode("Hello World");
        final TextNode clone = node.clone();
        Assert.assertEquals(node, clone);
    }

}