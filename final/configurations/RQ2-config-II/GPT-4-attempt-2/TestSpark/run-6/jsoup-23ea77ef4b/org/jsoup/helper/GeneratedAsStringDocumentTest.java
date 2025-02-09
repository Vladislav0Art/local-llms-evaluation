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

public class GeneratedAsStringDocumentTest {

    @Test
    public void asStringDocumentTest() throws ParserConfigurationException {
        Document doc = new Document("");
        W3CDom w3cDom = new W3CDom();
        Assert.assertNotNull(w3cDom.asString(doc));
    }

}