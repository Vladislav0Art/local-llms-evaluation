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

public class GeneratedAsStringDocumentWithPropertiesTest {

    @Test
    public void asStringDocumentWithPropertiesTest() throws ParserConfigurationException {
        Document doc = new Document("");
        W3CDom w3cDom = new W3CDom();
        Map<String, String> properties = new HashMap<>();
        properties.put("encoding", "UTF-8");
        Assert.assertNotNull(w3cDom.asString(doc, properties));
    }

}