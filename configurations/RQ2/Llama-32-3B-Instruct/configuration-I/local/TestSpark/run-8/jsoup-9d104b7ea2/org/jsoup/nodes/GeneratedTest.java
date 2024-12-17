package org.jsoup.nodes;

public class GeneratedTest {

    public Node testClone() {
        Node node = new Node("test", 1);
        Node clonedNode = node.clone();
        assertEquals(node, clonedNode);
        return null;
    }

    @Test
    public void testFromEncodedValidEncodedText() {
        String encodedText = "test";
        Node decodedNode = new Node(encodedText, 1);
        Node fromEncodedNode = decodedNode.createFromEncoded();
        assertEquals("test", fromEncodedNode.getValue());
        assertEquals(1, fromEncodedNode.getLevel());
    }

    @Test
    public void testNewInstance() {
        Node node = new Node("test", 1);
        Node clonedNode = node.newInstance();
        assertEquals(node, clonedNode);
    }
}

public class Node {
    private String value;
    private int level;

    public Node(String value, int level) {
        this.value = value;
        this.level = level;
    }

    public Node clone() {
        return new Node(value, level);
    }

    public String getValue() {
        return value;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Node node = (Node) obj;
        return value.equals(node.value);
    }

}