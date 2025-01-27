package org.jsoup.nodes;

public class GeneratedIsBlank_emptyString {

    @Test
    public void isBlank_emptyString() {
        TextNode node = new TextNode("");
        Assert.assertTrue(node.isBlank());
    }

}