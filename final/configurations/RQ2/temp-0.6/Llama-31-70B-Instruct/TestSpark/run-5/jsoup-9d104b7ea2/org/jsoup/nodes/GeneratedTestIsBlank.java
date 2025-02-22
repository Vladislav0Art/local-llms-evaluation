package org.jsoup.nodes;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestIsBlank {

    private TextNode textNode;
    private String text = "Some text";

    @Before
    public void setUp() {
        textNode = new TextNode(text);
    }

    @Test
    public void testIsBlank() {
        assertFalse(textNode.isBlank());
    }

}