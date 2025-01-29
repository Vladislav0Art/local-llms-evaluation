package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentBuilder;
import org.jsoup.nodes.DocumentFragment;
import org.jsoup.nodes.DocumentBuilder.Element;

public class GeneratedTestSourceNodes {

    @Test
    public void testSourceNodes() {
        String html = "<html><body>test</body></html>";
        List<String> sourceNodes = new ArrayList<>();
        NodeList nodeList = W3CDom.sourceNodes(NodeList.from(html), String.class);
        Assert.assertEquals(2, nodeList.getLength());
        for (String node : nodeList) {
            sourceNodes.add(node.getTextContent().trim());
        }
    }

}