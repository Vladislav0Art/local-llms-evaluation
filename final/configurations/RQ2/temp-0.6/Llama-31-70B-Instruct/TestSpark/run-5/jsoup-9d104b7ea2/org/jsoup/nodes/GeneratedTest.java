package org.jsoup.nodes;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private TextNode textNode;
    private String text = "Some text";

    @Before
    public void setUp() {
        textNode = new TextNode(text);
    }

    @Test
    public void testTextNodeConstructor() {
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.value);
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        assertEquals("Some text", textNode.text());
    }

    @Test
    public void testTextWithNullValue() {
        textNode = new TextNode(null);
        assertEquals("", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        assertEquals("Some text", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        assertFalse(textNode.isBlank());
    }

    @Test
    public void testIsBlankWithNullValue() {
        textNode = new TextNode(null);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testIsBlankWithEmptyValue() {
        textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode result = textNode.splitText(2);
        assertEquals("me", textNode.getWholeText());
        assertEquals(" text", result.getWholeText());
    }

    @Test
    public void testSplitTextWithNegativeOffset() {
        TextNode result = textNode.splitText(-1);
        assertEquals("Some text", textNode.getWholeText());
        assertNull(result);
    }

}