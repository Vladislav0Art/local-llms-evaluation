package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringWithPropertiesTest {

    @Test
    public void asStringWithPropertiesTest() {
        Document doc = Mockito.mock(Document.class);
        Map<String, String> properties = new HashMap<>();
        String result = W3CDom.asString(doc, properties);
        Assert.assertNotNull(result);
    }

}