package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.jupiter.api.Test;

public class GeneratedTestOutputHtml {

    @Test
    public void testOutputHtml() {
        W3CDom doc = new W3CDom();
        String html = "<html><body>Hello World!</body></html>";
        assertEquals("<html><body>Hello World!</body></html>", doc.outputHtml(html));
    }

}