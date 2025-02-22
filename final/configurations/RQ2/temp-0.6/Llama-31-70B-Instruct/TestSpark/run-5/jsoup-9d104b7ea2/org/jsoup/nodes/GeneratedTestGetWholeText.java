package org.jsoup.nodes;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetWholeText {

    private TextNode textNode;
    private String text = "Some text";

    @Before
    public void setUp() {
        textNode = new TextNode(text);
    }

    @Test
    public void testGetWholeText() {
        assertEquals("Some text", textNode.getWholeText());
    }

}