package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.junit.Assert;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

public class GeneratedOutputHtmlTest {

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> outputHtml = W3CDom.OutputHtml();
        Assert.assertNotNull(outputHtml);
        Assert.assertTrue(outputHtml.containsKey("method"));
        Assert.assertEquals("html", outputHtml.get("method"));
    }

}