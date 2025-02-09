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
public class GeneratedAsStringFromDocWithPropertiesTest {

    @Test
    public void asStringFromDocWithPropertiesTest() {
        org.w3c.dom.Document doc = new W3CDom().fromJsoup(new Document(""));
        Map<String, String> properties = new HashMap<>();
        String actual = W3CDom.asString(doc, properties);
        Assert.assertNotNull(actual);
    }

}