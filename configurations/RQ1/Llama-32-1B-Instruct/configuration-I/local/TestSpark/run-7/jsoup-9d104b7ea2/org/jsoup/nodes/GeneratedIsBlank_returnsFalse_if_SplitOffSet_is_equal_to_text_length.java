package org.jsoup.nodes;

public class GeneratedIsBlank_returnsFalse_if_SplitOffSet_is_equal_to_text_length {

    @Test
    public void isBlank_returnsFalse_if_SplitOffSet_is_equal_to_text_length() {
        Document document = new Document();
        assertTextIsBlank(document);
        // Test offset of 2, equal to text length
        String text = "Hello World!";
        document.addTextNode(splitText(2));
        assertEquals("World!", node.text());
    }

}