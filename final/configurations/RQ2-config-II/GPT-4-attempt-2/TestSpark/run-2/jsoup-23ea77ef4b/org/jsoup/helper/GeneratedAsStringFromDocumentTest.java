package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsStringFromDocumentTest {

    @Test
    public void asStringFromDocumentTest() {
        org.w3c.dom.Document doc = new W3CDom().fromJsoup(new Document(""));
        String actual = new W3CDom().asString(doc);
        Assert.assertNotNull(actual);
    }

}