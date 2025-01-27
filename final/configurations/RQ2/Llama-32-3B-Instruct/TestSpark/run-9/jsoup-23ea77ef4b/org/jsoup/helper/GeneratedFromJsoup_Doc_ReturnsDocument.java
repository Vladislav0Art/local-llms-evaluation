package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedFromJsoup_Doc_ReturnsDocument {

    @Test
    public void fromJsoup_Doc_ReturnsDocument() {
        Document in = Mockito.mock(Document.class);
        Document out = Mockito.mock(Document.class);
        when(W3CDom.convert(in)).thenReturn(out);
        Document result = W3CDom.fromJsoup(in);
        assertEquals(out, result);
    }

}