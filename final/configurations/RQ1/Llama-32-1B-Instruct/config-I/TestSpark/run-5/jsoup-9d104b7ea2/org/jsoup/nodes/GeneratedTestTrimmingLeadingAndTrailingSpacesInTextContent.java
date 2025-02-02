package org.jsoup.nodes;

public class GeneratedTestTrimmingLeadingAndTrailingSpacesInTextContent {

    @Test
    public void testTrimmingLeadingAndTrailingSpacesInTextContent() {
        String text = "   Hello World! ";
        String expected = "Hello World!";
        TextNode node = new TextNode(text);
        String result = String.valueOf(node.getText());
        assertEquals(expected, result);
    }

}