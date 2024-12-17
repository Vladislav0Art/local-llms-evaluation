package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.NodeType;
import org.jsoup.nodes.CharSequence;
import org.jsoup.nodes.Text;

public class GeneratedSplitTextReturnsCorrectValue {

    public void setMockedMethods(List<LeafNode> fields) throws NoSuchFieldException, IllegalAccessException {
        for (LeafNode field : fields) {
            field.setAccessible(true);
        }
    }

    @Test
    public void splitTextReturnsCorrectValue() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        int offset = 6;
        TextNode expectedText = new TextNode("World");
        TextNode actualText = textNode.splitText(offset);
        assertNotNull(actualText);
        assertEquals(expectedText, actualText);
    }

}