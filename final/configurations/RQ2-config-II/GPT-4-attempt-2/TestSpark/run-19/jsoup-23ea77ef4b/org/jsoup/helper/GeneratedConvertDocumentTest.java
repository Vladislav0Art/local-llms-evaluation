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

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() {
        Document in = new Document("Test");
        org.w3c.dom.Document result = W3CDom.convert(in);
        Assert.assertNotNull(result);
    }

}