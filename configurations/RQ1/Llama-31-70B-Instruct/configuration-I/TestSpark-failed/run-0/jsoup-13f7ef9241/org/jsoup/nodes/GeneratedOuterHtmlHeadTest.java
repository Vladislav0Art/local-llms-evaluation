package org.jsoup.nodes;

import org.jsoup.nodes.DataNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        DataNode dataNode = new DataNode("test");
        StringBuilder accum = new StringBuilder();
        try {
            dataNode.outerHtmlHead(accum, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals("test", accum.toString());
    }

}