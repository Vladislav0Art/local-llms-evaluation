package org.jsoup.parser;

public class GeneratedTestParseFragment {

    @Test
    public void testParseFragment() {
        String inputFragment = "<p>This is a paragraph.";
        List<Node> fragmentNodes = new ArrayList<>();
        fragmentNodes.add(new EntityNode("<span>", null));
        fragmentNodes.add(new TextNode("This"));
        fragmentNodes.add(new CommentNode("", null));
        String baseUri = "";
        Parser parser = new MockParser();
        Document docTree = treeBuilder.parseFragment(inputFragment, baseUri, parser);
        assertEquals(4, docTree.getDom().getElementsByTagName("p").getLength());
        assertEquals("<span>", docTree.getDom().getFirstChildElement("p"));
        assertEquals("This", ((TextNode) docTree.getDom().getFirstChildElement("p")).getTextContent());
    }

}