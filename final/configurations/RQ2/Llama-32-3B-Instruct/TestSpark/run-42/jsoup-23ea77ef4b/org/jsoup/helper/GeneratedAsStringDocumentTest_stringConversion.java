package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringDocumentTest_stringConversion {

    @Test
    public void asStringDocumentTest_stringConversion() {
        Document doc = new org.jsoup.nodes.Document();
        String expected = "Test String";
        assertTrue(W3CDom.asString(doc).equals(expected));
    }

}