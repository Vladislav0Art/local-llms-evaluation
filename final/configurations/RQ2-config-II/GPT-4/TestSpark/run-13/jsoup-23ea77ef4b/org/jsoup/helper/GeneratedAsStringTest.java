package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GeneratedAsStringTest {

    @Test
    public void AsStringTest() {
        org.w3c.dom.Document doc = Mockito.mock(org.w3c.dom.Document.class);
        String result = W3CDom.asString(doc);
        Assert.assertTrue(result instanceof String);
    }

}