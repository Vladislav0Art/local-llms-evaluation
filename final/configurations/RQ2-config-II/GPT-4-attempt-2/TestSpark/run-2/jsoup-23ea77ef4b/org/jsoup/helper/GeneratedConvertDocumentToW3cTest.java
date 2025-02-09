package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConvertDocumentToW3cTest {

    @Test
    public void convertDocumentToW3cTest() throws ParserConfigurationException {
        Document jsoupDoc = new Document("");
        org.w3c.dom.Document actual = W3CDom.convert(jsoupDoc);
        Assert.assertNotNull(actual);
    }

}