package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GeneratedAsStringWithPropertiesTest {

    @Test
    public void AsStringWithPropertiesTest() {
        org.w3c.dom.Document doc = Mockito.mock(org.w3c.dom.Document.class);
        HashMap<String, String> map = new HashMap<>();
        String result = W3CDom.asString(doc, map);
        Assert.assertTrue(result instanceof String);
    }

}