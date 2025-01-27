package org.jsoup.nodes;

public class GeneratedTestNodeSplit {

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
    public void testNodeSplit() {
        String text = "Hello\nWorld";
        Node node = new Node("TEXT", text);
        String result = node.splitText(0).toString();
        assertTrue(result.contains("Hello"));
        assertTrue(result.contains("World"));
    }

}