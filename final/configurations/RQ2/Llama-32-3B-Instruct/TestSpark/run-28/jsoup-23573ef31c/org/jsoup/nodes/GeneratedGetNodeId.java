package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedGetNodeId {

    @Test
    public void getNodeId() {
        Document document = new Document("https://www.example.com");
        String nodeId = document.nodeName();
        assertTrue(nodeId == null || nodeId.isEmpty());
    }

}