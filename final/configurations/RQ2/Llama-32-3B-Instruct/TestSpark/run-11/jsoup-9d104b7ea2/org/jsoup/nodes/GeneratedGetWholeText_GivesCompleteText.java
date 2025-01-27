package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedGetWholeText_GivesCompleteText {

    @Test
    public void getWholeText_GivesCompleteText() throws IOException {
        Node node = new LeafNode();
        Document doc = new Document(node);
        String html = doc.outerHtml();
        TextNode textNode = doc.selectFirst("text-node");
        Assert.assertEquals(html, textNode.getWholeText());
    }

}