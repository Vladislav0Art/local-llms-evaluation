package org.jsoup.nodes;

public class GeneratedTestHtml {

    @Test
    public void testHtml() {
        String html = "<html><body>Hello World!</body></html>";
        System.out.println(html);

        // Test 1: Text Node
        TextNode rootNode = parseHtml(html);
        assertNotNull(rootNode.getText());
        assertEquals("Hello World!", rootNode.getText());

        // Test 2: Text Node with Last Char as Whitespace
        TextNode nodeWithLastCharAsWhitespace = parseHtml("<p>This is a test</p>");
        assertNotNull(nodeWithLastCharAsWhitespace.getText());
        assertEquals("This", nodeWithLastCharAsWhitespace.getText());

        // Test 3: Multiple Nodes
        NodeList nodeList = getNodes(html);
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (!(node instanceof TextNode)) {
                System.out.println(node.getNodeType());
            }
        }

        // Test 4: Multiple Text Nodes with Last Char as Whitespace
        NodeList textNodesWithLastCharAsWhitespace = getNodes("<p>This is a test<p>Another Test</p>");
        for (int i = 0; i < textNodesWithLastCharAsWhitespace.getLength(); i++) {
            Node node = textNodesWithLastCharAsWhitespace.item(i);
            assertEquals("This", node.getText());
            assertNotNull(node.getNodeType());
        }

        // Test 5: Multiple Text Nodes with Last Char as Not Whitespace
        NodeList textNodesWithLastCharNotWhitespace = getNodes("<p>This is a test</p><p>Another Test</p>");
        for (int i = 0; i < textNodesWithLastCharNotWhitespace.getLength(); i++) {
            Node node = textNodesWithLastCharNotWhitespace.item(i);
            assertEquals("test", node.getText());
            assertNotNull(node.getNodeType());
        }

        // Test 6: Multiple Text Nodes with Last Char as Empty String
        NodeList textNodesWithLastCharEmptyString = getNodes("<p>This is a test</p><p>Another Test</p>");
        for (int i = 0; i < textNodesWithLastCharEmptyString.getLength(); i++) {
            Node node = textNodesWithLastCharEmptyString.item(i);
            assertEquals("", node.getText());
            assertNotNull(node.getNodeType());
        }
    }

    public static TextNode parseHtml(String html) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(html));
        return (TextNode) builder.parse(is).getBody().getTextNode();
    }

    public static NodeList getNodes(String html) throws Exception {
        javax.swing.text.Document document = new javax.swing.text.SimpleDocumentModel(html);
        javax.swing.text.html.HTMLParser parser = new javax.swing.text HTMLParser() {
            @Override
            public void handleStartTag ( int kind, String name,int attrs[]){
                super.handleStartTag(kind, name, attrs);
                if (name.equals("html")) {
                    parseBody();
                }
            }

            private void parseBody () {
                String text = this.getText();
                document.add(new javax.swing.text.html.JTextRenderer().getFormattedString(text));
            }
        } ;
        parser.setDocument(document);

        return javax.swing.text HTMLParser.parserResult(getNodeNames(parser), getAttributes(parser));
    }

    public static String[] getNodeNames(Iterator<Node> nodes) {
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        while (nodes.hasNext()) {
            Node node = nodes.next();
            if (node instanceof TextNode) {
                names.add(((TextNode) node).getNodeName());
            } else if (node instanceof Comment) {
                names.add(((Comment) node).getComment().getLine());
            }
        }
        return names.toArray(new String[0]);
    }

    public static class Comment implements javax.swing.text.JTextRenderer.Comment {
        @Override
        public String getDisplay() {
            return "";
        }
    }

    public static class TextNode extends javax.swing.text.Element implements java.io.Serializable {
        private static final long serialVersionUID = 1L;
        private int type;

        public TextNode(int type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "";
        }
    }

}