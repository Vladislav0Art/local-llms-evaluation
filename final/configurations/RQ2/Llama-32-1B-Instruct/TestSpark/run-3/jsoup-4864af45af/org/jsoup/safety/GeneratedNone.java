package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.*;

public class GeneratedNone {

    private Document document = new Document();
    private String tagName;

    @Test
    public void none() {
        when(document.select(tagName).first()).thenReturn(null);
        Safelist none = new Safelist();
        assertEquals(none, none.none());
        verify(nothing(), times(1)).none();
    }

}