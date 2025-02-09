package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringTest_stringConversion {

    @Test
    public void asStringTest_stringConversion() {
        String expected = "Test String";
        Document doc = new org.jsoup.nodes.Document();
        assertTrue(W3CDom.asString(doc, null).equals(expected));
    }

}