package org.jsoup.nodes;

public class GeneratedTestGetOffsetAndTail {

    private String value;
    private int length;

    public TestNode() {
    }

    public boolean isBlank() {
        return false;
    }

    public String getValue() {
        return value;
    }
}

public class TextTest {
    @BeforeAll
    public static void setUp() {
        textNode = new TestNode();
        tailNode = new TestNode("Hello World!");
        accum = "   Hello World!";
    }

    private static TestNode textNode;
    private static TestNode tailNode;
    private static String accum;

    @Test
    public void testGetOffsetAndTail() {
        int offset = 5;
        int length = tailNode.getValue().length();
        assertEquals(offset, 0);
        assertEquals(length, tailNode.getValue().length());
    }

}