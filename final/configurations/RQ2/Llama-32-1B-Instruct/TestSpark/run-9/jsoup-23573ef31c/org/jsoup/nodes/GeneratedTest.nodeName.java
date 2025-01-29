package org.jsoup.nodes;

public class GeneratedTest.

nodeName {

    private static Document document;

    @Before
    public void setup () {
        document = new Document("http://example.com");
    }

    @Test
    public void test.nodeName() {
        String nodeName = document.nodeName();
        assertEquals("test-node-name", nodeName);
    }

}