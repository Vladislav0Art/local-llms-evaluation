package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.W3CDom;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import java.util.HashMap;
import java.util.Map;

public class GeneratedFromJsoupElementNullInputTest {

    @Test
    public void fromJsoupElementNullInputTest() {
        org.w3c.dom.Document w3cDocument = new W3CDom().fromJsoup((TextNode) null);
        Assert.assertNotNull(w3cDocument);
    }

}