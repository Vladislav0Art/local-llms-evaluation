package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedConvert_DocToString {

    @Test
    public void convert_DocToString() {
        Document doc = Mockito.mock(Document.class);
        String expected = "some string";
        StringWriter writer = new StringWriter();
        Transformer transformer = Mockito.mock(Transformer.class);
        when(transformer.transform(new DOMSource(doc), new StreamResult(writer))).thenReturn(null);
        W3CDom.convert(null, transformer).asString();
        assertEquals(expected, writer.toString());
    }

}