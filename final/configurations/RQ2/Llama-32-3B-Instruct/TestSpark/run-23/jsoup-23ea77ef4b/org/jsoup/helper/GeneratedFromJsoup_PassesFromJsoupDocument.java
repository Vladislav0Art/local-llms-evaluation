package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedFromJsoup_PassesFromJsoupDocument {

    @Test
    public void fromJsoup_PassesFromJsoupDocument() {
        Document soup = Document.create("html");
        Document dom = W3CDom.fromJsoup(soup);
        Assert.assertNotNull(dom);
    }

}