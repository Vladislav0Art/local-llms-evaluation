package org.jsoup.nodes;

import org.jsoup.nodes.DataNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        DataNode dataNode = new DataNode("data");
        assertEquals("#data", dataNode.nodeName());
    }

    @Test
    public void getWholeDataTest() {
        DataNode dataNode = new DataNode("data");
        assertEquals("data", dataNode.getWholeData());
    }

    @Test
    public void setWholeDataTest() {
        DataNode dataNode = new DataNode("data");
        dataNode.setWholeData("newData");
        assertEquals("newData", dataNode.getWholeData());
    }

    @Test
    public void outerHtmlHeadTest() {
        DataNode dataNode = new DataNode("data");
        StringBuilder accum = new StringBuilder();
        try {
            dataNode.outerHtmlHead(accum, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals("data", accum.toString());
    }

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

    @Test
    public void toStringTest() {
        DataNode dataNode = new DataNode("data");
        assertEquals("data", dataNode.toString());
    }

    @Test
    public void cloneTest() {
        DataNode dataNode = new DataNode("data");
        DataNode clone = dataNode.clone();
        assertEquals("data", clone.getWholeData());
    }

}