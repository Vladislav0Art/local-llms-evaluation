package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.NodeType;
import org.jsoup.nodes.CharSequence;
import org.jsoup.nodes.Text;

public class GeneratedNodeNameReturnsCorrectValue {

    public void setMockedMethods(List<LeafNode> fields) throws NoSuchFieldException, IllegalAccessException {
        for (LeafNode field : fields) {
            field.setAccessible(true);
        }
    }

    @Test
    public void nodeNameReturnsCorrectValue() throws NoSuchFieldException, IllegalAccessException {
        setMockedMethods(List.of(document().node("foo").field(NodeType.class)));
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode.nodeName());
        assertEquals("foo", textNode.nodeName());
    }

}