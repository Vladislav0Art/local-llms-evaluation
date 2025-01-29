package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.*;

public class GeneratedBasic {

    private Document document = new Document();
    private String tagName;

    @Test
    public void basic() {
        when(document.select(tagName).first()).thenReturn(new Element("a"));
        Safelist basic = new Safelist(basic().basic());
        assertEquals(basic, basic.basic());
        verify(document).select(tagName);
        verify(basic).basic();
    }

}