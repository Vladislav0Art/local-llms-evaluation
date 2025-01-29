package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.*;

public class GeneratedRelaxed {

    private Document document = new Document();
    private String tagName;

    @Test
    public void relaxed() {
        when(document.select(tagName).first()).thenReturn(new Element("img"));
        Safelist relaxed = new Safelist(relaxed().relaxed());
        assertEquals(relaxed, relaxed.relaxed());
        verify(document).select(tagName);
        verify(relaxed).relaxed();
    }

}