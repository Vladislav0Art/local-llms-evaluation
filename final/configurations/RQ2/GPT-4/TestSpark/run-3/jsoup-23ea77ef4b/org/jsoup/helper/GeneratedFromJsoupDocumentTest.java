package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Properties;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() {
        Document mockDocument = Mockito.mock(Document.class);
        W3CDom w3CDom = new W3CDom();
        Assert.assertNotNull(w3CDom.fromJsoup(mockDocument));
    }

}