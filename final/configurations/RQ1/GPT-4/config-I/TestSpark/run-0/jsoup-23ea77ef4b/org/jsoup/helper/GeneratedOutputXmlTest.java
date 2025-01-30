package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.W3CDom;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import java.util.Properties;
import java.util.HashMap;
import java.util.Map;

public class GeneratedOutputXmlTest {

    @Test
    public void outputXmlTest() {
        HashMap<String, String> xmlOutputSettings = W3CDom.OutputXml();
        Assert.assertEquals("xml", xmlOutputSettings.get(OutputKeys.METHOD));
    }

}