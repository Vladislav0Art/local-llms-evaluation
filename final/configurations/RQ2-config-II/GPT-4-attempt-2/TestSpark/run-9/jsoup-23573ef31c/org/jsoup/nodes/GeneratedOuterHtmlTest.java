package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        Document document = Document.createShell("http://outerhtmltest.com");
        Assert.assertEquals("<html>\n <head></head>\n <body></body>\n</html>", document.outerHtml());
    }

}