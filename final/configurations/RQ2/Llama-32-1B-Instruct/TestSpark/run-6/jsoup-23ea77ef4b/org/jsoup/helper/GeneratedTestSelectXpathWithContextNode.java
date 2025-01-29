package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentBuilder;
import org.jsoup.nodes.DocumentFragment;
import org.jsoup.nodes.DocumentBuilder.Element;

public class GeneratedTestSelectXpathWithContextNode {

    @Test
    public void testSelectXpathWithContextNode() {
        Document doc = neworg.jsoup.nodes.DocumentBuilder().build("<html><body>test</body></html>");
        String html = "<html><body>comment1<comment2/>(<span>test</span>)</span>";
        org.jsoup.nodes.Document contextDoc = doc;
        NodeList nodeList = W3CDom.selectXpath("comment", contextDoc);
        Assert.assertTrue(nodeList.getLength() == 4);
    }

}