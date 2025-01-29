package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.*;

public class GeneratedRemoveProtocols {

    private Document document = new Document();
    private String tagName;

    @Test
    public void removeProtocols() {
        when(document.select(tagName).first()).thenReturn(new Element("a"));
        Safelist simpleText = new Safelist(simpleText().simpleText());
        simpleText.removeProtocols("src", "href");
        assertEquals(0, document.select(tagName).first().attributes().size());
        verify(document).select(tagName);
    }

}