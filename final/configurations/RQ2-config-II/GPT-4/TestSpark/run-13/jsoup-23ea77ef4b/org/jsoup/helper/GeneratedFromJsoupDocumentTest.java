package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void FromJsoupDocumentTest() {
        Document doc = Mockito.mock(Document.class);
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document result = w3cDom.fromJsoup(doc);
        Assert.assertNotNull(result);
    }

}