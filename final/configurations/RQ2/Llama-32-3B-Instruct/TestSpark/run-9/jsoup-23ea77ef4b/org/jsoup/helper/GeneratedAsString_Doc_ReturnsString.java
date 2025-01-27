package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAsString_Doc_ReturnsString {

    @Test
    public void asString_Doc_ReturnsString() {
        Document doc = new Document();
        String expected = "some string";
        W3CDom.asString(doc, null).equals(expected);
    }

}