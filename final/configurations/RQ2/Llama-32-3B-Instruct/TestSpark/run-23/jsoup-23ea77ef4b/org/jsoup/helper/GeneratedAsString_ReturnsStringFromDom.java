package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedAsString_ReturnsStringFromDom {

    @Test
    public void asString_ReturnsStringFromDom() {
        Document doc = Document.create("html");
        String result = W3CDom.asString(doc);
        Assert.assertNotNull(result);
    }

}