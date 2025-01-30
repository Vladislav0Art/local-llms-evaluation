package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.W3CDom;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import java.util.Properties;
import java.util.HashMap;
import java.util.Map;

public class GeneratedOutputHtmlTest {

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> htmlOutputSettings = W3CDom.OutputHtml();
        Assert.assertEquals("html", htmlOutputSettings.get(OutputKeys.METHOD));
    }

}