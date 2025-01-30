package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GeneratedNamespaceAwareTest {

    private static final String INPUT_HTML = "<html><head><title>Title</title></head><body>Body</body></html>";

    @Test
    public void namespaceAwareTest() {
        W3CDom w3CDom = new W3CDom();
        Assert.assertTrue(w3CDom.namespaceAware());
        w3CDom.namespaceAware(false);
        Assert.assertFalse(w3CDom.namespaceAware());
    }

}