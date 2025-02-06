package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.Map;

public class GeneratedAsString_documentReturnsCorrectString {

    @Test
    public void asString_documentReturnsCorrectString() {
        Document doc = Mockito.mock(Document.class);
        String expected = "correct string";
        String result = W3CDom.asString(doc);
        assertEquals(expected, result);
    }

}