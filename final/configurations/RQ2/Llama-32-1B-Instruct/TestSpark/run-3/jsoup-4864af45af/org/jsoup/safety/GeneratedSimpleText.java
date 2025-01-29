package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.*;

public class GeneratedSimpleText {

    private Document document = new Document();
    private String tagName;

    @Test
    public void simpleText() {
        when(document.select(tagName).first()).thenReturn(new Element("p"));
        Safelist simpleText = new Safelist(simpleText().simpleText());
        assertEquals(simpleText, simpleText.simpleText());
        verify(document).select(tagName);
        verify(simpleText).simpleText();
    }

}