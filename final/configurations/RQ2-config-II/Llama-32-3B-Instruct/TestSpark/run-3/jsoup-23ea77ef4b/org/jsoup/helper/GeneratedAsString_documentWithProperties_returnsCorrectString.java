package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.Map;

public class GeneratedAsString_documentWithProperties_returnsCorrectString {

    @Test
    public void asString_documentWithProperties_returnsCorrectString() {
        Document doc = Mockito.mock(Document.class);
        Map<String, String> properties = Mockito.mock(Map.class);
        String expected = "correct string";
        String result = W3CDom.asString(doc, properties);
        assertEquals(expected, result);
    }

}