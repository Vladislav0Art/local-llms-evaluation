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

public class GeneratedConvertToOutDocumentTest {

    @Test
    public void convertToOutDocumentTest() {
        W3CDom w3CDom = new W3CDom();
        org.jsoup.nodes.Document in = Mockito.mock(org.jsoup.nodes.Document.class);
        Document out = Mockito.mock(Document.class);
        w3CDom.convert(in, out);
        Assert.assertNotNull(out);
    }

}