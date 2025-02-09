package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.HashMap;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        org.w3c.dom.Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        String result = new W3CDom().asString(doc);
        Assert.assertNotNull(result);
    }

}