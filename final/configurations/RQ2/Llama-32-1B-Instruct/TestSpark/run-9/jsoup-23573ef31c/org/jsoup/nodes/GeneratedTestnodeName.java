package org.jsoup.nodes;

import java.util.List;
import java.util.stream.Collectors;

public class GeneratedTestnodeName {

    private static Document document;

    @Before
    public void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testnodeName() {
        String nodeName = document.nodeName();
        assertEquals("test-node-name", nodeName);
    }

}