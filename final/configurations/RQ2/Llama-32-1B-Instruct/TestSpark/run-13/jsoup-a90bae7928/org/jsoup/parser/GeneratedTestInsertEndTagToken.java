package org.jsoup.parser;

public class GeneratedTestInsertEndTagToken {

    private XmlTreeBuilder xmlTreeBuilder;

    @Before
    public void setup() {
        // Initialize mock parser and reader here if needed
    }

    @Test
    public void testInsertEndTagToken() {
        String inputFragment = "</html>";
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, "", null);
        assertTrue(nodes.size() > 1);
        Node endTagNode = nodes.get(0);
        assertEquals("</html>", endTagNode.getTextContent());
    }

}