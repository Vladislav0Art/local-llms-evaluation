package org.jsoup.nodes;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestTextWithNullValue {

    private TextNode textNode;
    private String text = "Some text";

    @Before
    public void setUp() {
        textNode = new TextNode(text);
    }

    @Test
    public void testTextWithNullValue() {
        textNode = new TextNode(null);
        assertEquals("", textNode.text());
    }

}