package org.jsoup.nodes;

public class GeneratedTestNormaliseWhitespace {

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
    public void testNormaliseWhitespace() {
        assertEquals("Hello, World!", Node.normaliseWhitespace("   Hello, World!   "));
        assertEquals("", Node.normaliseWhitespace("   "));
        assertEquals("\n", Node.normaliseWhitespace("\n"));
    }

}