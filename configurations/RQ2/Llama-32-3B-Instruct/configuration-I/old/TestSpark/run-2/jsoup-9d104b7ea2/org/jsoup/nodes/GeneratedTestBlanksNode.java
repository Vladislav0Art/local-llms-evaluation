package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class GeneratedTestBlanksNode {

    @Test
    public void testBlanksNode() {
        Node node = Jsoup.parse("<node>text</node>").body().children().get(0);
        assertFalse(node.isBlank());
    }

}