package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.*;

public class GeneratedBasicWithImages {

    private Document document = new Document();
    private String tagName;

    @Test
    public void basicWithImages() {
        when(document.select(tagName).first()).thenReturn(new Element("img"));
        Safelist basicWithImages = new Safelist(basicWithImages().basicWithImages());
        assertEquals(basicWithImages, basicWithImages.basicWithImages());
        verify(document).select(tagName);
        verify(basicWithImages).basicWithImages();
    }

}