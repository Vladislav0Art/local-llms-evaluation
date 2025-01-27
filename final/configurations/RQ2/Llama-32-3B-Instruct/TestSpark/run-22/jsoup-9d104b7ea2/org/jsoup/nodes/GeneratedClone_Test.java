package org.jsoup.nodes;

public class GeneratedClone_Test {

    private TextNode node;

    @Before
    public void setup() {
        this.node = new TextNode("Hello, World!");
    }

    /**
     * [nodeName]Test
     */

    @Test
    public void clone_Test() throws IOException {
        TextNode cloned = new Node(NodeType.TEXT, "World");
        cloned.outerHtmlHead(new StringBuffer(), 0, new Document.OutputSettings());
        cloned.clone();
        assertEquals("World", node.text());

        TextNode firstNode = (TextNode) node.clone();
        assertEquals("", firstNode.nodeName());
    }

}