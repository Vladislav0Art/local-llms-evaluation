package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentBuilder;
import org.jsoup.nodes.DocumentFragment;
import org.jsoup.nodes.DocumentBuilder.Element;

public class GeneratedTestAsString {

    @Test
    public void testAsString() {
        String html = "<html><body>test</body></html>";
        Document doc = neworg.jsoup.nodes.DocumentBuilder().build(html);
        String asString = W3CDom.asString(doc);
        Assert.assertEquals("http://example.com", asString);
    }

}