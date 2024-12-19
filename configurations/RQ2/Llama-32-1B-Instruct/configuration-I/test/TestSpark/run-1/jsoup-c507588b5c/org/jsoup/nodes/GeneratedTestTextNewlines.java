package org.jsoup.nodes;

public class GeneratedTestTextNewlines {

    private TextNode node;

    @Before
    public void setup() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testTextNewlines() {
        String text = "This is a test\nwith multiple lines.";
        assertEquals("This is a test with multiple lines.", node.getText(text));
    }

}