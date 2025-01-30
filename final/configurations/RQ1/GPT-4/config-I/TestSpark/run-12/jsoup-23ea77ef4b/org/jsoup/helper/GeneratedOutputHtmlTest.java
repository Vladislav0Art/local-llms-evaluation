package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.Map;
import java.util.HashMap;

public class GeneratedOutputHtmlTest {

    @Test
    public void outputHtmlTest() {
        Map<String, String> output = W3CDom.OutputHtml();
        Assert.assertTrue(output.size() == 1);
        Assert.assertTrue(output.containsKey("method"));
        Assert.assertEquals("html", output.get("method"));
    }

}