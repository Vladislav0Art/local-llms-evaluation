package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    private static final String TEST_TEXT = "<p>Hello World!</p>";

    @Test
    public void testOuterHtmlTail() throws Exception {
        Document document = documentBuilder().createDocument();
        Node parent = document.createElement("html");
        parentNode.appendChild(parent);

        TextNode node = (TextNode) document.createElement("p").appendChild(documentFactory.createNode(documentBuilderFactory.createDocumentBuilder().newDocumentFragment())).appendChild(node);
        node.outerHtmlTail(new Appendable() {
            @Override
            public void append(StringBuilder builder, int depth) {
            }

            @Override
            public void append(Appendable appendable, int depth) {
            }
        }, 0, Document.OutputSettings.INDENT_NO_SPACE);

        assertTrue(document.hasChildNodes());
    }

    private static org.jsoup.nodes.Document documentBuilder() {
        return new org.jsoup.impl.DefaultDocumentBuilderFactory().newDocumentBuilder();
    }

}