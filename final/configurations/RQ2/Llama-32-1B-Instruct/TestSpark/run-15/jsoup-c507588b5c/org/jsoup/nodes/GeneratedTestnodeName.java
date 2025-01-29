package org.jsoup.nodes;

public class GeneratedTestnodeName {

    private LeafNode leafNode;

    @Before
    public void setup() throws IOException {
        Document document = new Document();
        Appendable appendable = document.append("Hello World!");
        leafNode = TextNode.createFromEncoded(toString(appendable));
    }

    @Test
    public void testnodeName() {
        assertEquals("text", leafNode.nodeName());
    }

}