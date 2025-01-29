package org.jsoup.nodes;

public class GeneratedNodeName {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void nodeName() throws Exception {
        Document doc = createDocument(BASE_URI);
        String nodeName = doc.nodeName();
        assertNotNull(nodeName);
    }

}