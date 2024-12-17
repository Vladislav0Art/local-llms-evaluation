package org.jsoup.nodes;

public class GeneratedTestSplitText_GivenValidOffset_ReturnsNewTextNode {

    private String value;

    public TextNode(String value) {
        this.value = value;
    }

    public String getWholeText() {
        return value;
    }

    public String splitText(int offset) throws IllegalArgumentException {
        if (offset 0 || offset > value.length()){
            throw new IllegalArgumentException("Offset is out of bounds");
        }
        return value.substring(0, offset);
    }

    public boolean isBlank() {
        return value.isEmpty();
    }

    public String getValue() {
        return value;
    }
}

public class GeneratedTest {

    @Test
    public void testSplitText_GivenValidOffset_ReturnsNewTextNode() throws IllegalArgumentException {
        String rawText = "Hello World!";
        int offset = 6;
        TextNode textNode = new TextNode(rawText);
        String result = textNode.splitText(offset);
        assertNotNull(result);
        assertEquals("World", result);
    }

}