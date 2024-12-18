package org.jsoup.nodes;

import org.jsoup.nodes.DataNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetWholeDataTest {

    @Test
    public void setWholeDataTest() {
        DataNode dataNode = new DataNode("test");
        dataNode.setWholeData("new test");
        assertEquals("new test", dataNode.getWholeData());
    }

}