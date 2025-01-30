package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GeneratedOutputXmlTest {

    private static final String INPUT_HTML = "<html><head><title>Title</title></head><body>Body</body></html>";

    @Test
    public void outputXmlTest() {
        HashMap<String, String> outputXml = W3CDom.OutputXml();
        Assert.assertEquals("xml", outputXml.get("method"));
    }

}