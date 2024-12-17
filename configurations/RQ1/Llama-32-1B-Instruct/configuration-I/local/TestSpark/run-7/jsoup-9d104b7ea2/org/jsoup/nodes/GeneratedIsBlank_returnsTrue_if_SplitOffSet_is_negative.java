package org.jsoup.nodes;

public class GeneratedIsBlank_returnsTrue_if_SplitOffSet_is_negative {

    @Test
    public void isBlank_returnsTrue_if_SplitOffSet_is_negative() {
        Document document = new Document();
        assertTextIsBlank(document);
        // Test negative offset
        String text = "Hello World";
        document.addTextNode(text);
        assertNotTextIsBlank(document);
        // Test offset of -1
        String text = "Hello\nWorld";
        document.addTextNode(splitText(-1));
        assertEquals("World", node.text());
    }

}