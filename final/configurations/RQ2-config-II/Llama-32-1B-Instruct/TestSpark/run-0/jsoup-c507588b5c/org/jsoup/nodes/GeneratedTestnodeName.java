package org.jsoup.nodes;

public class GeneratedTestnodeName {

    private Document document;
    private String[] nodeNames = new String[0];

    @Test
    public void testnodeName() throws Exception {
        // Mocking is used for simplicity, replace with actual mocking if needed
        String nodeName = "node-name";
        nodeNames = new String[]{nodeName};

        TextNode nodeUnderTest = new TextNode("test text");
        assertEquals(nodeName, nodeUnderTest.nodeName());
    }

}