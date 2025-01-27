package org.jsoup.nodes;

public class GeneratedTestStripLeadingWhitespace {

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
    public void testStripLeadingWhitespace() {
        assertEquals("", Node.stripLeadingWhitespace(""));
        assertEquals(" ", Node.stripLeadingWhitespace(" "));
        assertEquals("\n", Node.stripLeadingWhitespace("\n"));
    }

}