package org.jsoup.nodes;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSplitTextWithNegativeOffset {

    private TextNode textNode;
    private String text = "Some text";

    @Before
    public void setUp() {
        textNode = new TextNode(text);
    }

    @Test
    public void testSplitTextWithNegativeOffset() {
        TextNode result = textNode.splitText(-1);
        assertEquals("Some text", textNode.getWholeText());
        assertNull(result);
    }

}