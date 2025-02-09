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

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() {
        Document document = Mockito.mock(Document.class);
        org.w3c.dom.Document result = W3CDom.convert(document);
        Assert.assertNotNull(result);
    }

}