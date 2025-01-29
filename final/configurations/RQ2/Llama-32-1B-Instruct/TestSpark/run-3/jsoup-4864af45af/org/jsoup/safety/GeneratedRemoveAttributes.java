package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.*;

public class GeneratedRemoveAttributes {

    private Document document = new Document();
    private String tagName;

    @Test
    public void removeAttributes() {
        when(document.select(tagName).first()).thenReturn(new Element("p"));
        Safelist simpleText = new Safelist(simpleText().simpleText());
        simpleText.removeAttributes("style");
        assertEquals(0, document.select(tagName).first().attributes().size());
        verify(document).select(tagName);
    }

}