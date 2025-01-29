package org.jsoup.parser;

public class GeneratedTestParseDocument {

    @Test
    public void testParseDocument() {
        String input = "<html><body>Hello World!</body></html>";
        Document doc = new Document(new StringReader(input));
        TreeBuilder treeBuilder = new XmlTreeBuilder();
        TreeBuilder.Document docTree = treeBuilder.parse(doc, "");
        assertEquals("Hello World!", docTree.toString());
    }

}