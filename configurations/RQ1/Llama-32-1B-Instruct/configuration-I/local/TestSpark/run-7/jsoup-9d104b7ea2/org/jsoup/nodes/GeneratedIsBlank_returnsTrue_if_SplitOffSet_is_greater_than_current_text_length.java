package org.jsoup.nodes;

public class GeneratedIsBlank_returnsTrue_if_SplitOffSet_is_greater_than_current_text_length {

    @Test
    public void isBlank_returnsTrue_if_SplitOffSet_is_greater_than_current_text_length() {
        Document document = new Document();
        assertTextIsBlank(document);
        // Test offset of 1, less than text length
        String text = "Hello World!";
        document.addTextNode(splitText(1));
        assertEquals("World!", node.text());
    }

}