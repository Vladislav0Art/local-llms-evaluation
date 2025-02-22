package org.jsoup.nodes;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestIsBlankWithNullValue {

    private TextNode textNode;
    private String text = "Some text";

    @Before
    public void setUp() {
        textNode = new TextNode(text);
    }

    @Test
    public void testIsBlankWithNullValue() {
        textNode = new TextNode(null);
        assertTrue(textNode.isBlank());
    }

}