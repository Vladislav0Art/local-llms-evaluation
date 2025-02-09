package org.jsoup.nodes;

public class GeneratedNodeName_IsTextNode_ReturnsNodeName {

    private String encodedText;

    public TextNode(String encodedText) {
        this.encodedText = encodedText;
    }

    public String getNodeName() {
        return "TextNode";
    }

    public String getText() {
        return encodedText;
    }

    public String getWholeText() {
        return encodedText;
    }

    public static boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }
}

public class GeneratedTest {

    @Test
    public void nodeName_IsTextNode_ReturnsNodeName() throws Exception {
        TextNode node = new TextNode("");
        assertEquals(node.getNodeName(), "TextNode");
    }

}