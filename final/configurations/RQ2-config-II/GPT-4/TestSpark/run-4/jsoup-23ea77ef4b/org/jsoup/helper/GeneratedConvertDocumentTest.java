package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() {
        org.jsoup.nodes.Document in = Mockito.mock(org.jsoup.nodes.Document.class);
        Document doc = W3CDom.convert(in);
        Assert.assertNotNull(doc);
    }

}