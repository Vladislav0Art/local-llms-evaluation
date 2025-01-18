package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Properties;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() throws Exception {
        org.w3c.dom.Document mockDocument = Mockito.mock(org.w3c.dom.Document.class);
        HashMap<String, String> properties = new HashMap<>();
        Assert.assertNotNull(W3CDom.asString(mockDocument, properties));
    }

}