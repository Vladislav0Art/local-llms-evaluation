package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testNodeSplitText() {
        String node = "Hello, World!";
        int offset = 7; // 'W' is at index 6

        Node nodeObj = new Node(node);
        String result = nodeObj.splitText(offset);

        assertEquals("World!", result);
    }
}

class Node {
    private String content;

    public Node(String content) {
        this.content = content;
    }

    public String splitText(int offset) {
        return content.substring(0, offset);
    }

}