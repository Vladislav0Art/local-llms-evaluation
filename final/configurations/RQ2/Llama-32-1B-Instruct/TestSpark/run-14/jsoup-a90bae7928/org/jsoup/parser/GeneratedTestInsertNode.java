package org.jsoup.parser;

public class GeneratedTestInsertNode {

    @Test
    public void testInsertNode() {
        String input = "<html><body>Hello World!</body></html>";
        Document doc = new Document(new StringReader(input));
        TreeBuilder treeBuilder = new XmlTreeBuilder();
        List<Node> nodes = new ArrayList<>();
        treeBuilder.insertNodes(nodes, null);
        assertEquals(4, nodes.size());
    }

}