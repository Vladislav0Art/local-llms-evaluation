package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestOutputXml {

    private W3CDom w3cdom = new W3CDom();

    @Before
    public void setup() {
        String wsdl = "<wsdl:definitions xmlns:wsdl='http://schemas.xmlsoap.org/wsdl/' xmlns:xsd='http://www.w3.org/2001/XMLSchema'><wsdl:binding style='document' name='MyBinding'><wsdl:part name='myPart' element='MyElement'/></wsdl:binding></wsdl:definitions>";
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new java.io.ByteArrayInputStream(wsdl.getBytes()));
        W3CDom convertDoc = w3cdom.convert(doc);
        Properties propertiesFromMap = new Properties();
        propertiesFromMap.put("wsdl", wsdl);
        Map<String, String> map = w3cdom.OutputHtml().getOutputProperties(propertiesFromMap);

        w3cdom = new W3CDom(convertDoc, map);
    }

    @Test
    public void testOutputXml() {
        Document doc = w3cdom.fromJsoup(new org.jsoup.nodes.Document());
        String outputXml = w3cdom.OutputXml().getOutput();
        assertEquals(wsdl, outputXml);
    }

}