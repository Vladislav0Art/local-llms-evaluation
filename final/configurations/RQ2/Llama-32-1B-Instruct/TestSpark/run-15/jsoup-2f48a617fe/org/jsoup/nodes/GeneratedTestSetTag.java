package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestSetTag {

    @Test
    public void testSetTag() {
        Node node = new LeafNode();
        String tag = "example";
        node.setTag(tag);
        assertEquals(tag, node.getTag());
    }

}