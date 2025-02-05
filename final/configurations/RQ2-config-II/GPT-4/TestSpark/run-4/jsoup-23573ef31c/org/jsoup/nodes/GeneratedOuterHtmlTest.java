package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        Document document = Document.createShell("https://www.example.com");
        String html = document.outerHtml();
        Assert.assertNotNull(html);
    }

}