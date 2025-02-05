package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.*;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        Document document = Document.createShell("http://example.com");
        Assert.assertNotNull(document.outerHtml());
    }

}