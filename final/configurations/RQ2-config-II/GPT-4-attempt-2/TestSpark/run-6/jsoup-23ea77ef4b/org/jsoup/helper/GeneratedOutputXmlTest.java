package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.junit.Assert;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

public class GeneratedOutputXmlTest {

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> outputXml = W3CDom.OutputXml();
        Assert.assertNotNull(outputXml);
        Assert.assertTrue(outputXml.containsKey("method"));
        Assert.assertEquals("xml", outputXml.get("method"));
    }

}