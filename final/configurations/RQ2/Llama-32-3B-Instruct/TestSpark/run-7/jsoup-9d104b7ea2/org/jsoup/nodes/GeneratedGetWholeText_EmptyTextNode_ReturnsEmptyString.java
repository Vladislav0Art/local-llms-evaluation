package org.jsoup.nodes;

public class GeneratedGetWholeText_EmptyTextNode_ReturnsEmptyString {

    @Test
    public void getWholeText_EmptyTextNode_ReturnsEmptyString() {
        String expected = "";
        TextNode actual = new TextNode("");
        assertEquals(expected, actual.getWholeText());
    }

}