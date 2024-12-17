package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class GeneratedTestBlankNode {

    @Test
    public void testBlankNode() {
        Node node = Jsoup.parse("<node>text</node>").body().children().first();
        assertTrue(node.isBlank());
    }

}