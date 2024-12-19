package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.NodeType;
import org.jsoup.nodes.CharSequence;
import org.jsoup.nodes.Text;

public class GeneratedIsBlankReturnsCorrectValue {

    public void setMockedMethods(List<LeafNode> fields) throws NoSuchFieldException, IllegalAccessException {
        for (LeafNode field : fields) {
            field.setAccessible(true);
        }
    }

    @Test
    public void isBlankReturnsCorrectValue() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

}