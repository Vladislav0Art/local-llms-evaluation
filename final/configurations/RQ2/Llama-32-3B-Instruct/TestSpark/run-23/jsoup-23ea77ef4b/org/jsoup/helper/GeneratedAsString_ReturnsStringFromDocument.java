package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedAsString_ReturnsStringFromDocument {

    @Test
    public void asString_ReturnsStringFromDocument() {
        String result = W3CDom.asString(Document.create("html"));
        Assert.assertNotNull(result);
    }

}