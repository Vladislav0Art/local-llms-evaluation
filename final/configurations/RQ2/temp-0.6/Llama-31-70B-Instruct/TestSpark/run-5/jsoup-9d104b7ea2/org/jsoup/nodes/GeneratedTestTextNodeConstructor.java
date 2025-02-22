package org.jsoup.nodes;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestTextNodeConstructor {

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

}