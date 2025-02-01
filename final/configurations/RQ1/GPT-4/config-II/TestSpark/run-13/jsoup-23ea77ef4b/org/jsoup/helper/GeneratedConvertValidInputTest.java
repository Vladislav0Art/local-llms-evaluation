package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeVisitor;
import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Text;
import org.w3c.dom.NodeList;

import javax.annotation.Nullable;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathFactoryConfigurationException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConvertValidInputTest {

    @Test
    public void convertValidInputTest() {
        Document document = org.jsoup.Jsoup.parse("<html><body><p>Test</p></body></html>");
        org.w3c.dom.Document convertedDoc = W3CDom.convert(document);
        assertNotNull(convertedDoc);
    }

}