package org.jsoup.nodes;

public class GeneratedTestTextNodeCreation {

    private String value;

    public Node(String value) {
        this.value = value;
    }

    public static Node createFromEncoded(String encodedValue) {
        return new Node(encodedValue);
    }

    public String getValue() {
        return value;
    }
}

public class GeneratedTest {

    @Test
    public void testTextNodeCreation() {
        Node node = Node.createFromEncoded("Hello, World!");
        assertEquals("Hello, World!", node.getValue());
    }

}