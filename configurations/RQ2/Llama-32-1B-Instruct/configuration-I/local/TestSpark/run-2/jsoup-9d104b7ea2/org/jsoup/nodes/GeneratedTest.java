package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void [TextNode][Scenario]

    Test_textIsBlank() {
        String original = "Hello World!";
        TextNode node = TextNode.createFromEncoded(original);
        assertTrue(node.isBlank());
    }

    @Test
    public void [TextNode][Scenario]

    Test_textHasNewline() {
        String original = "\nThis is a line of text.\n";
        TextNode node = TextNode.createFromEncoded(original);
        assertEquals("This is a line of text.", node.text(original));
    }

    @Test
    public void [TextNode][Scenario]

    Test_splitTextAtZeroOffset() {
        String original = "Hello World!";
        TextNode node = TextNode.createFromEncoded(original);
        TextNode result = node.splitText(0);
        assertNotNull(result);
    }

    @Test
    public void [TextNode][Scenario]

    Test_splitTextAtNegativeOffset() {
        String original = "Hello World!";
        TextNode node = TextNode.createFromEncoded(original);
        assertEquals("Hello World!", node.text(original));
    }

    @Test
    public void [TextNode][Scenario]

    Test_textHasLeadingWhitespace() {
        String original = "   Hello World!   ";
        TextNode node = TextNode.createFromEncoded(original);
        assertTrue(node.isBlank());
    }

    @Test
    public void [TextNode][Scenario]

    Test_textDoesNotHaveTrailingWhitespace() {
        String original = "Hello World!";
        TextNode node = TextNode.createFromEncoded(original);
        assertFalse(node.isBlank());
    }

    @Test
    public void [TextNode][Scenario]

    Test_cloneIsSameAsOriginal() {
        String original = "Hello World!";
        TextNode node1 = TextNode.createFromEncoded(original);
        TextNode node2 = node1.clone();
        assertEquals(node1, node2);
    }

    @Test
    public void [TextNode][Scenario]

    Test_textIsNormalized() {
        String original = "&lt;Hello&gt;";
        TextNode node = TextNode.createFromEncoded(original);
        assertEquals("&lt;Hello&gt;", node.text(original));
    }

}