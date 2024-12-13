package org.jsoup.nodes;

import org.jsoup.nodes.DataNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        DataNode dataNode = new DataNode("data");
        assertEquals("#data", dataNode.nodeName());
    }

}