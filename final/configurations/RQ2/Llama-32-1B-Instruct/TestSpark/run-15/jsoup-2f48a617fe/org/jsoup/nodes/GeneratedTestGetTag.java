package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetTag {

    @Test
    public void testGetTag() {
        Node node = new LeafNode();
        assertEquals("tag", node.getTag());
        node.setTag("new_tag");
        assertEquals("new_tag", node.getTag());
    }

}