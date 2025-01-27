package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;

public class GeneratedClone_BasicClone_ReturnsSameObject {

    @Test
    public void clone_BasicClone_ReturnsSameObject() {
        TextNode node = new TextNode("test");
        TextNode cloned = node.clone();
        assertSame(node, cloned);
    }

}