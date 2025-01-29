package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.jupiter.api.Test;

public class GeneratedTestNamespaceAwareConstructor {

    @Test
    public void testNamespaceAwareConstructor() {
        W3CDom doc = new W3CDom();
        Properties properties = null;
        Map<String, String> map = null;

        // Mocking not used in this case

        Document document = org.jsoup.nodes.Document.parse("html");
        assertEquals(true, doc.namespaceAware(document));
    }

}