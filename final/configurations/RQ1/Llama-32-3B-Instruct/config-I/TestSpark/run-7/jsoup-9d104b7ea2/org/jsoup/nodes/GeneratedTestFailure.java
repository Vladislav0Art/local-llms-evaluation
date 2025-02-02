package org.jsoup.nodes;

public class GeneratedTestFailure {

    @Test
    public void testFailure() {
        try {
            Node node = new Node("");
            assertFalse(node.isBlank());
            fail("Expected False to be returned but True was returned");
        } catch (Exception e) {
            fail("Expected Exception to be thrown");
        }
    }
}

public class Node {

    private String text;

    public Node(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public boolean isBlank() {
        return text.isEmpty();
    }

}