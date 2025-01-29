package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentBuilder;
import org.jsoup.nodes.DocumentFragment;
import org.jsoup.nodes.DocumentBuilder.Element;

public class GeneratedTestFromJsoup {

    @Test
    public void testFromJsoup() {
        Document doc = neworg.jsoup.nodes.DocumentBuilder().build("<html><body>test</body></html>");
        W3CDom.W3CDom fromJsoupDoc = W3CDom.fromJsoup(doc);
        Assert.assertEquals("http://example.com", fromJsoupDoc.getAttributes().getNamedItem("xmlns").getValue());
    }

}