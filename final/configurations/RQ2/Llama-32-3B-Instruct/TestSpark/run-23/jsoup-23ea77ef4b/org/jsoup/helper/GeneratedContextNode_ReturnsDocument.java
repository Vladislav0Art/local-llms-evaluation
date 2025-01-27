package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedContextNode_ReturnsDocument {

    @Test
    public void contextNode_ReturnsDocument() {
        Document wDoc = Document.create("html");
        Document result = W3CDom.contextNode(wDoc);
        Assert.assertNotNull(result);
    }

}