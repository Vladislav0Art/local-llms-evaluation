package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.util.HashMap;
import java.util.Map;

public class GeneratedMethodMapTest {

    private static final String INPUT_HTML = "<html><head><title>Title</title></head><body>Body</body></html>";

    @Test
    public void methodMapTest() {
        HashMap<String, String> result = W3CDom.methodMap("method");
        Assert.assertEquals("method", result.get("method"));
    }

}