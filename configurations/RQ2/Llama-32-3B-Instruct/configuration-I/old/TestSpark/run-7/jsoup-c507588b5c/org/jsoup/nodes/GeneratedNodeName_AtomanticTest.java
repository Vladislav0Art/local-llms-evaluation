package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeName_AtomanticTest {

    @Test
    public void nodeName_AtomanticTest() {
        String nodeName = "text";
        assertEquals(nodeName, ((TextNode) mockText()).nodeName());
    }

}