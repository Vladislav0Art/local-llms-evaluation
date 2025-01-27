package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAsString_DocWithProperties_ReturnsString {

    @Test
    public void asString_DocWithProperties_ReturnsString() {
        Document doc = Mockito.mock(Document.class);
        Map<String, String> properties = new HashMap<>();
        when(doc.getProperties()).thenReturn(properties);
        String expected = "some string";
        W3CDom.asString(doc, properties).equals(expected);
    }

}