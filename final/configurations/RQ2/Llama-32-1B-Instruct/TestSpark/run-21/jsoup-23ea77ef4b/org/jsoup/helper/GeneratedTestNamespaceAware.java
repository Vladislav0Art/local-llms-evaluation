package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.jupiter.api.Test;

public class GeneratedTestNamespaceAware {

    @Test
    public void testNamespaceAware() {
        W3CDom doc = new W3CDom();
        boolean result = doc.namespaceAware();
        assertTrue(result);
    }

}