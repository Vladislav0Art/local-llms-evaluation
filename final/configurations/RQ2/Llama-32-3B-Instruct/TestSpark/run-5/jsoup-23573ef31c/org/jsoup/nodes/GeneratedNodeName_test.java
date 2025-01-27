package org.jsoup.nodes;

public class GeneratedNodeName_test {

    @Test
    public void nodeName_test() {
        Document document = new Document("http://example.com");
        String name = document.nodeName();
        assertNotNull(name);
    }

}