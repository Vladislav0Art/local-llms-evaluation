package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Text;

public class GeneratedTestXmlDeclaration {

    public static String nodeName(String comment) {
        return comment.nodeName();
    }

    @Test
    public void testXmlDeclaration() {
        Node node = new Tag("", 1);
        node.appendChild(new Text(""));
        assertEquals(false, node.isXmlDeclaration());
    }

}