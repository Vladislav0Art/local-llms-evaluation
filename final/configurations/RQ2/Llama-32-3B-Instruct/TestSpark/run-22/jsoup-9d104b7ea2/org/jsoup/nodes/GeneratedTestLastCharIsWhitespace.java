package org.jsoup.nodes;

public class GeneratedTestLastCharIsWhitespace {

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
    public void testLastCharIsWhitespace() {
        assertTrue(Node.lastCharIsWhitespace(new StringBuilder()));
        assertFalse(Node.lastCharIsWhitespace(new StringBuilder('1')));
        assertThrows(IndexOutOfBoundsException.class, () -> Node.lastCharIsWhitespace(new StringBuilder(0)));
    }

}