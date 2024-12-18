package org.jsoup.nodes;

import org.jsoup.nodes.DataNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        DataNode dataNode = new DataNode("data");
        StringBuilder accum = new StringBuilder();
        try {
            dataNode.outerHtmlTail(accum, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals("", accum.toString());
    }

}