package org.jsoup.nodes;

public class GeneratedTestGetWholeText_GivenEmptyText_ReturnsEmptyString {

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
    public void testGetWholeText_GivenEmptyText_ReturnsEmptyString() {
        String rawText = "";
        TextNode textNode = new TextNode(rawText);
        assertEquals("", textNode.getWholeText());
    }

}