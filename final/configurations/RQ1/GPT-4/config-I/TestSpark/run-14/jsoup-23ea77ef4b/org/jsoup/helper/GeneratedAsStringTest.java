package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GeneratedAsStringTest {

    private static final String INPUT_HTML = "<html><head><title>Title</title></head><body>Body</body></html>";

    @Test
    public void asStringTest() {
        Document document = Jsoup.parse(INPUT_HTML);
        org.w3c.dom.Document w3cDocument = W3CDom.convert(document);
        String documentString = W3CDom.asString(w3cDocument, W3CDom.OutputHtml());
        Assert.assertNotNull(documentString);
        Assert.assertTrue(documentString.contains("<html>"));
    }

}