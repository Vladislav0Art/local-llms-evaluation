package org.jsoup.nodes;

import org.jsoup.nodes.DataNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetWholeDataTest {

    @Test
    public void getWholeDataTest() {
        DataNode dataNode = new DataNode("test");
        assertEquals("test", dataNode.getWholeData());
    }

}