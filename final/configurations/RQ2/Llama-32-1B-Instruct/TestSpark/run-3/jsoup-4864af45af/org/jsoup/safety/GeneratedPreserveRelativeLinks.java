package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.*;

public class GeneratedPreserveRelativeLinks {

    private Document document = new Document();
    private String tagName;

    @Test
    public void preserveRelativeLinks() {
        when(document.select(tagName).first()).thenReturn(new Element("a"));
        Safelist simpleText = new Safelist(simpleText().simpleText());
        simpleText.preserveRelativeLinks(true);
        assertEquals(1, document.select(tagName).first().children().size());
        verify(document).select(tagName);
    }

}