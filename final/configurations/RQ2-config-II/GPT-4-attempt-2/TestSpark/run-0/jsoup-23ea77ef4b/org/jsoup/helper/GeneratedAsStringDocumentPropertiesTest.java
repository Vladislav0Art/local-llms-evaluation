package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringDocumentPropertiesTest {

    @Test
    public void asStringDocumentPropertiesTest() {
        W3CDom dom = new W3CDom();
        org.w3c.dom.Document w3cDoc = dom.fromJsoup(new Document(""));
        Map<String, String> properties = new HashMap<>();
        String result = W3CDom.asString(w3cDoc, properties);
        Assert.assertNotNull(result);
    }

}