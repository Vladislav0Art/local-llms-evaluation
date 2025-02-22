package org.jsoup.nodes;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestIsBlankWithEmptyValue {

    private TextNode textNode;
    private String text = "Some text";

    @Before
    public void setUp() {
        textNode = new TextNode(text);
    }

    @Test
    public void testIsBlankWithEmptyValue() {
        textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}