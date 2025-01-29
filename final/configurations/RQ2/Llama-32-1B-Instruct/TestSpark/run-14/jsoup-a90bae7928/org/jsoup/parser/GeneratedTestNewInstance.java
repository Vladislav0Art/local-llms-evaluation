package org.jsoup.parser;

public class GeneratedTestNewInstance {

    @Test
    public void testNewInstance() {
        Document doc = new Document();
        TreeBuilder treeBuilder = new XmlTreeBuilder();
        TreeBuilder.Document docTree = treeBuilder.newInstance();
        assertEquals(docTree, doc);
    }
}

class MockParser extends Parser {
    @Override
    public Token parse(String input) throws Exception {
        return new Token(input);
    }

    @Override
    public Token parse(String baseUri) throws Exception {
        return null;
    }

}