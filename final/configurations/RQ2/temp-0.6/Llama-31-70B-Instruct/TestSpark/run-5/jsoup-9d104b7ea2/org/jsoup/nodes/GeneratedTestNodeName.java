package org.jsoup.nodes;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestNodeName {

    private TextNode textNode;
    private String text = "Some text";

    @Before
    public void setUp() {
        textNode = new TextNode(text);
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

}