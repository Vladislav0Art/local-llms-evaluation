package org.jsoup.nodes;

import org.jsoup.nodes.DataNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        DataNode dataNode = new DataNode("test");
        DataNode clone = dataNode.clone();
        assertEquals("test", clone.getWholeData());
    }

}