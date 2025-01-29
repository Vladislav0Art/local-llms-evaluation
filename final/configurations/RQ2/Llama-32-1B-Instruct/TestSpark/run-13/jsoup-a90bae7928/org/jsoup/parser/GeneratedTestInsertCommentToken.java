package org.jsoup.parser;

public class GeneratedTestInsertCommentToken {

    private XmlTreeBuilder xmlTreeBuilder;

    @Before
    public void setup() {
        // Initialize mock parser and reader here if needed
    }

    @Test
    public void testInsertCommentToken() {
        String inputFragment = "<!-- comment -->";
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, "", null);
        assertTrue(nodes.size() > 0);
        Node commentNode = nodes.get(0);
        assertEquals("<!-- comment -->", commentNode.getTextContent());
    }

}