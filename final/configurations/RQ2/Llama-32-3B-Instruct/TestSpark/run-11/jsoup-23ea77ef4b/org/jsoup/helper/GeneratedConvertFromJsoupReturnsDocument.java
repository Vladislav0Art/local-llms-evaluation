package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertFromJsoupReturnsDocument {

    @Test
    public void convertFromJsoupReturnsDocument() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        Document outDoc = W3CDom.convert(doc);
        assertTrue(outDoc instanceof Document);
    }

}