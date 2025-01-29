package org.jsoup.nodes;

public class GeneratedGetNodeType {

    @Test
    public void getNodeType() {
        Node node = new Node("<div>");
        String nodeType = node.getNodeType();
        System.out.println(nodeType);
    }
}

class CommentParserTest {

    public static void commentToString(Document document) {
        for (Node node : document.getAllNodes()) {
            if (node instanceof TextNode && ((TextNode) node).getText().equals("test")) {
                System.out.println("Text content: " + ((TextNode) node).getText());
            }
        }
    }

}