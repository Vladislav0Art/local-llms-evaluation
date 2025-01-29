package org.jsoup.parser;

public class GeneratedTestInsertDoctypeToken {

    private XmlTreeBuilder xmlTreeBuilder;

    @Before
    public void setup() {
        // Initialize mock parser and reader here if needed
    }

    @Test
    public void testInsertDoctypeToken() {
        String inputFragment = "<!DOCTYPE html><html></html>";
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, "", null);
        assertTrue(nodes.size() > 1);
        Node doctypeNode = nodes.get(0);
        assertEquals("<!DOCTYPE html>", doctypeNode.getTextContent());
    }

}