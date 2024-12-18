package org.jsoup.nodes;

import org.jsoup.nodes.DataNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        DataNode dataNode = new DataNode("test");
        assertEquals("test", dataNode.toString());
    }

}