package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    private String text;
    private Appendable output;

    @Test
    public void testIsBlank() {
        this.text = "   \n";
        Assert.assertTrue(TextNode.isBlank());
    }

}