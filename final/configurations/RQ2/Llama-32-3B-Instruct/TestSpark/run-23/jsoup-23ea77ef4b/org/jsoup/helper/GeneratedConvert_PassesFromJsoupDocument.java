package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedConvert_PassesFromJsoupDocument {

    @Test
    public void convert_PassesFromJsoupDocument() {
        Document soup = Document.create("html");
        Document dom = W3CDom.convert(soup);
        Assert.assertNotNull(dom);
    }

}