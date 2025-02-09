package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        Document document = Mockito.mock(Document.class);
        org.w3c.dom.Document result = w3cDom.fromJsoup(document);
        Assert.assertNotNull(result);
    }

}