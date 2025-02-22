package org.jsoup.nodes;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSplitText {

    private TextNode textNode;
    private String text = "Some text";

    @Before
    public void setUp() {
        textNode = new TextNode(text);
    }

    @Test
    public void testSplitText() {
        TextNode result = textNode.splitText(2);
        assertEquals("me", textNode.getWholeText());
        assertEquals(" text", result.getWholeText());
    }

}