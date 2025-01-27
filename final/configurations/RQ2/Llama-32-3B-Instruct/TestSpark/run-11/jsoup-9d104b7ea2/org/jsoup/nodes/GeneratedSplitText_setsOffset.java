package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedSplitText_setsOffset {

    @Test
    public void splitText_setsOffset() throws IOException {
        Node node = new LeafNode();
        Document doc = new Document(node);
        String html = doc.outerHtml();
        TextNode textNode = doc.selectFirst("text-node");
        int offset = 10;
        textNode.splitText(offset);
        Assert.assertEquals(offset, 10);
    }

}