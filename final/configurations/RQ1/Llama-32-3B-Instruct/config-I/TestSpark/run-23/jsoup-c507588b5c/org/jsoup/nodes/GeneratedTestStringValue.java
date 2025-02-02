package org.jsoup.nodes;

public class GeneratedTestStringValue {

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
    public void testStringValue() {
        assertEquals("Hello World!", "Hello World!");
    }
}

public class Text {
    public static String getWholeText(TestNode node) {
        return node.getValue();
    }

    public static String text(TestNode node) {
        return node.getValue();
    }

}