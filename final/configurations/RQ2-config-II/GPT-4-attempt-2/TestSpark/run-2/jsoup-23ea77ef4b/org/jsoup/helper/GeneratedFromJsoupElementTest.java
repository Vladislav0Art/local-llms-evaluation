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
public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() throws ParserConfigurationException {
        Document jsoupDoc = new Document("");
        org.w3c.dom.Document actual = new W3CDom().fromJsoup(jsoupDoc);
        Assert.assertNotNull(actual);
    }

}