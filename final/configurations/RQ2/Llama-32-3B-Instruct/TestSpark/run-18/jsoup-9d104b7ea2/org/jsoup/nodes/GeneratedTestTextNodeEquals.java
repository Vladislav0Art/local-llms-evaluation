package org.jsoup.nodes;

public class GeneratedTestTextNodeEquals {

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
    public void testTextNodeEquals() {
        String text = "Hello World";
        Node node = new Node("TEXT", text);
        assertEquals(node.getResultText(), text);
    }

}