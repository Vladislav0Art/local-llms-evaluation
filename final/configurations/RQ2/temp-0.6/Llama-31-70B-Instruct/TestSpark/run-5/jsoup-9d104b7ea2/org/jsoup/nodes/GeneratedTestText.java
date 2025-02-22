package org.jsoup.nodes;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestText {

    private TextNode textNode;
    private String text = "Some text";

    @Before
    public void setUp() {
        textNode = new TextNode(text);
    }

    @Test
    public void testText() {
        assertEquals("Some text", textNode.text());
    }

}