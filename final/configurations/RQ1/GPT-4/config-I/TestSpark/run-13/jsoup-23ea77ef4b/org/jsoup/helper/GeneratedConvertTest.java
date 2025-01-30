package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class GeneratedConvertTest {

    @Test
    public void convertTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html></html>");
        Document convertedDoc = W3CDom.convert(jsoupDoc);
        Assert.assertNotNull(convertedDoc);
    }

}