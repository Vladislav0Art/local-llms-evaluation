package org.jsoup.parser;

public class GeneratedTestPopStackToClose {

    @Test
    public void testPopStackToClose() {
        Element endTag = new Token.EndTag("p");
        String inputFragment = "<html><body>Hello World!</body></html>";
        List<Node> fragmentNodes = new ArrayList<>();
        fragmentNodes.add(new EntityNode("<span>", null));
        fragmentNodes.add(new TextNode("This"));
        fragmentNodes.add(new CommentNode("", null));
        Document docTree = treeBuilder.parseFragment(inputFragment, "", new MockParser());
        assertEquals(1, ((TreeBuilder.Document) docTree).popStackToClose(endTag));
    }

}