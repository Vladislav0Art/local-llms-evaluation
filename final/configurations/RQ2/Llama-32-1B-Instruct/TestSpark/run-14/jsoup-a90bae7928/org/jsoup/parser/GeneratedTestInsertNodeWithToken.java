package org.jsoup.parser;

public class GeneratedTestInsertNodeWithToken {

    @Test
    public void testInsertNodeWithToken() {
        String input = "<html><body>Hello World!</body></html>";
        Document doc = new Document(new StringReader(input));
        TreeBuilder treeBuilder = new XmlTreeBuilder();
        List<Node> nodes = new ArrayList<>();
        treeBuilder.insertNodes(nodes, null);
        assertEquals(5, nodes.size());
    }

}