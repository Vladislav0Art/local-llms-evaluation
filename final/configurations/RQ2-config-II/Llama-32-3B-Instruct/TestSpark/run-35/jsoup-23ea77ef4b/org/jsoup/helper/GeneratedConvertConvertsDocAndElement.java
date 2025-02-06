package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConvertConvertsDocAndElement {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Test
    public void convertConvertsDocAndElement() {
        org.jsoup.nodes.Document jsoupDoc = new org.jsoup.nodes.Document();
        Element jsoupElement = new org.jsoup.nodes.Element();
        Document expectedDoc = new Document();
        Document expectedElement = new Document();
        W3CDom.w3cDom.convert(jsoupDoc, expectedDoc);
        W3CDom.w3cDom.convert(jsoupElement, expectedElement);
    }

}