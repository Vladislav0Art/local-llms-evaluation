package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Text;

public class GeneratedTestIsXmlDeclaration {

    @Test
    public void testIsXmlDeclaration() {
        Node node = new Node(new Tag("", 1));
        node.appendChild(new Text(""));
        assertTrue(node.isXmlDeclaration());
    }

}