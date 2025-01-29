package org.jsoup.parser;

public class GeneratedTestInsertTokenDoctypeAndCommentTokens {

    private XmlTreeBuilder xmlTreeBuilder;

    @Before
    public void setup() {
        // Initialize mock parser and reader here if needed
    }

    @Test
    public void testInsertTokenDoctypeAndCommentTokens() {
        String inputFragment = "<<!DOCTYPE html><html></html>";
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, "", null);
        assertTrue(nodes.size() > 1);
        Node doctypeNode = (Node) nodes.get(0);
        assertEquals("<!DOCTYPE html>", doctypeNode.getTextContent());
        Node commentNode = (Node) nodes.get(1);
        assertEquals("<!-- comment -->", commentNode.getTextContent());
    }

}