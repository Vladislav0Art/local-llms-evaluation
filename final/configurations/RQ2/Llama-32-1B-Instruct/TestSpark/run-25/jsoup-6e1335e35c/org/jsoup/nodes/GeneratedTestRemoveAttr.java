package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestRemoveAttr {

    @Test
    public void testRemoveAttr() {
        Node node = new Node();
        node.removeAttribute("attr1");
        System.out.println(node.getAttribute("attr1")); // Should print null, because we removed the attribute
    }

}