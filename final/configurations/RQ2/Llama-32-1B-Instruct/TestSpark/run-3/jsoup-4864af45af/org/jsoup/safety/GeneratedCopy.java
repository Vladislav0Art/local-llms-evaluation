package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.*;

public class GeneratedCopy {

    private Document document = new Document();
    private String tagName;

    @Test
    public void copy() {
        when(document.select(tagName).first()).thenReturn(new Element("img"));
        Safelist copy = new Safelist(copy().copy());
        assertEquals(copy, copy.copy());
        verify(document).select(tagName);
        verify(copy).copy();
    }

}