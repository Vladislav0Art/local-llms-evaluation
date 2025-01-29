package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestnodeName {

    @Test
    public void testnodeName() {
        String nodeName = new TextNode("test").nodeName();
        assertEquals("text", nodeName);
    }

}