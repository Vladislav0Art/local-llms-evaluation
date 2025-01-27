package org.jsoup.nodes;

public class GeneratedTestNodeName {

    private String nodeName;
    private String resultText;

    public Node(String nodeName, String resultText) {
        this.nodeName = nodeName;
        this.resultText = resultText;
    }

    public String nodeName() {
        return nodeName;
    }

    public String getResultText() {
        return resultText;
    }
}

public class GeneratedTest {

    @Test
    public void testNodeName() {
        Node node = new Node("TEXT", "Hello World");
        assertEquals(node.nodeName(), "TEXT");
    }

}