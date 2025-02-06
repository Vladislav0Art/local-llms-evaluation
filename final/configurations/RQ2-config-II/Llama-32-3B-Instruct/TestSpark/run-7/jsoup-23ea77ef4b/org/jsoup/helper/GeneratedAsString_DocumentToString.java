package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsString_DocumentToString {

    @Test
    public void asString_DocumentToString() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        String expectedString = "some string";
        String actualString = W3CDom.asString(document, null);
        assertTrue(actualString.contains(expectedString));
    }

}