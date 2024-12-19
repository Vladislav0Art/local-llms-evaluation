package org.jsoup.nodes;

public class GeneratedTest {

    private LeafNode parentNode = null;
    private LeafNode currentSibling = null;

    @Test
    public void isBlank() {
        // Test if this text node is blank -- that is, empty or only whitespace (including newlines).
        assert TextNode.isBlank();
    }

    @Test
    public void splitText() {
        // Test splitting a text node into two nodes at the specified string offset.
        String text = "Hello World!";
        assertEquals(6, currentSibling.text().length());
        TextNode newNode = TextNode.splitText(2);
        assert new Node(newSource, newNode, null).text().isEmpty();
    }

    @Test
    public void splitText_noOffset() {
        // Test splitting a text node into two nodes without an offset.
        String text = "Hello World!";
        assertEquals(6, currentSibling.text().length());
    }

    @Test
    public void splitText_atOffset0() {
        // Test splitting a text node at the first character (offset 0).
        assert TextNode.splitText(0).text().isEmpty();
    }

    @Test
    public void splitText_atOffset1() {
        // Test splitting a text node at the second character (offset 1).
        String text = "Hello World!";
        assertEquals("World", currentSibling.text());
    }

    @Test
    public void splitText_atOffset_n() {
        // Test splitting a text node at an arbitrary offset.
        for (int i = 0; i < 10; i++) {
            TextNode newNode = TextNode.splitText(i);
            assert !new Node(newSource, newNode, null).text().isEmpty();
        }
    }

    @Test
    public void splitText_withNewNode() {
        // Test that a new node is created with the text after the offset.
        String text = "Hello World!";
        LeafNode newNode = TextNode.splitText(6);
        assert !new Node(newSource, newNode, null).text().isEmpty();
    }

    @Test
    public void splitText_withParent() {
        // Test that a new node is created with the text after the offset if it's within a block.
        String text = "<p>Hello World!</p>";
        LeafNode parent = new Node(newSource, TextNode.createFromEncoded(text), null);
        LeafNode newNode = TextNode.splitText(5);
        assert !new Node(parent, newNode, null).text().isEmpty();
    }

    @Test
    public void splitText_withTrim() {
        // Test that a new node is created with the text after the offset and trimmed.
        String text = "Hello World!";
        LeafNode parent = new Node(newSource, TextNode.createFromEncoded(text), null);
        LeafNode newNode = TextNode.splitText(2).trim();
        assert !new Node(parent, newNode, null).text().isEmpty();
    }

    @Test
    public void splitText_withTrimTrailing() {
        // Test that a new node is created with the text after the offset and trimmed trailing.
        String text = "Hello World!";
        LeafNode parent = new Node(newSource, TextNode.createFromEncoded(text), null);
        LeafNode newNode = TextNode.splitText(2).trimTrailing();
        assert !new Node(parent, newNode, null).text().isEmpty();
    }

    @Test
    public void splitText_withTrimLeading() {
        // Test that a new node is created with the text after the offset and trimmed leading.
        String text = "Hello World!";
        LeafNode parent = new Node(newSource, TextNode.createFromEncoded(text), null);
        LeafNode newNode = TextNode.splitText(2).trimLeading();
        assert !new Node(parent, newNode, null).text().isEmpty();
    }

    @Test
    public void splitText_withLastCharWhitespace() {
        // Test that a new node is created with the text after the offset and trimmed leading whitespace.
        String text = "Hello World!";
        LeafNode parent = new Node(newSource, TextNode.createFromEncoded(text), null);
        LeafNode newNode = TextNode.splitText(2).lastCharIsWhitespace();
        assert !new Node(parent, newNode, null).text().isEmpty();
    }

    @Test
    public void splitText_withLastCharacterNotWhitespace() {
        // Test that a new node is created with the text after the offset and trimmed leading non-whitespace character.
        String text = "Hello World!";
        LeafNode parent = new Node(newSource, TextNode.createFromEncoded(text), null);
        LeafNode newNode = TextNode.splitText(2).lastCharIsWhitespace();
        assert !new Node(parent, newNode, null).text().isEmpty();
    }

    @Test
    public void splitText_noEntities() {
        // Test that the last character is not replaced by an entity.
        String text = "Hello World!";
        LeafNode parent = new Node(newSource, TextNode.createFromEncoded(text), null);
        LeafNode newNode = TextNode.splitText(2).lastCharIsWhitespace();
        assert !new Node(parent, newNode, null).text().isEmpty();
    }

}