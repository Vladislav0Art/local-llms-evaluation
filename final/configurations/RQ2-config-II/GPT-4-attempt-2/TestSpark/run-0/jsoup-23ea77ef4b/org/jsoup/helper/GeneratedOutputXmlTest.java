package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

public class GeneratedOutputXmlTest {

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> outputXml = W3CDom.OutputXml();
        Assert.assertNotNull(outputXml);
    }

}