package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedAsString_document_withoutProperties {

    @Test
    public void asString_document_withoutProperties() {
        Document doc = new org.w3c.dom.Document();
        assertEquals("", W3CDom.asString(doc));
    }

}