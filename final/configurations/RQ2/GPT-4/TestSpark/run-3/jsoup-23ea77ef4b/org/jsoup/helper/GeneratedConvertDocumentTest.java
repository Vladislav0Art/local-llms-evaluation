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

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() {
        Document mockDocument = Mockito.mock(Document.class);
        Assert.assertNotNull(W3CDom.convert(mockDocument));
    }

}