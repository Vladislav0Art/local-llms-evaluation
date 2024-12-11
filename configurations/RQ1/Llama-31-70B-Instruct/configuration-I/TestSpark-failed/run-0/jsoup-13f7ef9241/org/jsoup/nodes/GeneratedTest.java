package org.jsoup.nodes;

import org.jsoup.nodes.DataNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getWholeDataTest() {
        DataNode dataNode = new DataNode("test");
        assertEquals("test", dataNode.getWholeData());
    }

    @Test
    public void setWholeDataTest() {
        DataNode dataNode = new DataNode("test");
        dataNode.setWholeData("new test");
        assertEquals("new test", dataNode.getWholeData());
    }

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

    @Test
    public void outerHtmlTailTest() {
        DataNode dataNode = new DataNode("test");
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
        DataNode dataNode = new DataNode("test");
        assertEquals("test", dataNode.toString());
    }

    @Test
    public void cloneTest() {
        DataNode dataNode = new DataNode("test");
        DataNode clone = dataNode.clone();
        assertEquals("test", clone.getWholeData());
    }

}