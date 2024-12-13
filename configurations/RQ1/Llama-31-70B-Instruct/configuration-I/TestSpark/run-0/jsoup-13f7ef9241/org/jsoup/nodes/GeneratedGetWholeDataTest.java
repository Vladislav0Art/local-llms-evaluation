package org.jsoup.nodes;

import org.jsoup.nodes.DataNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetWholeDataTest {

    @Test
    public void getWholeDataTest() {
        DataNode dataNode = new DataNode("data");
        assertEquals("data", dataNode.getWholeData());
    }

}