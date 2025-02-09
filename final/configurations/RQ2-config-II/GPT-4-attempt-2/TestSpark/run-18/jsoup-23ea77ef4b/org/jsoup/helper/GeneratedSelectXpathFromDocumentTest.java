package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedSelectXpathFromDocumentTest {

    @Test
    public void selectXpathFromDocumentTest() throws Exception {
        W3CDom dom = new W3CDom();
        org.w3c.dom.Document w3cDoc = Mockito.mock(org.w3c.dom.Document.class);
        NodeList nodeList = dom.selectXpath("/path", w3cDoc);
        assertNotNull(nodeList);
    }

}