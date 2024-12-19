package org.jsoup.nodes;

public class GeneratedTestFromEncodedValidEncodedText {

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

}