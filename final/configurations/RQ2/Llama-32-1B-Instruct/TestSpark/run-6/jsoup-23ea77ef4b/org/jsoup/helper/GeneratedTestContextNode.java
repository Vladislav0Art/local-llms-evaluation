package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentBuilder;
import org.jsoup.nodes.DocumentFragment;
import org.jsoup.nodes.DocumentBuilder.Element;

public class GeneratedTestContextNode {

    @Test
    public void testContextNode() {
        Document doc = neworg.jsoup.nodes.DocumentBuilder().build("<html><body>test</body></html>");
        Node contextNode = W3CDom.contextNode(doc);
        Assert.assertNotNull(contextNode);
    }

}