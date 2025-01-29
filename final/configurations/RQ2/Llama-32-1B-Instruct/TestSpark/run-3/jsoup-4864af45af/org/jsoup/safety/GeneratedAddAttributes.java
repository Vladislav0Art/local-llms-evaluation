package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.*;

public class GeneratedAddAttributes {

    private Document document = new Document();
    private String tagName;

    @Test
    public void addAttributes() {
        when(document.select(tagName).first()).thenReturn(new Element("p"));
        Safelist simpleText = new Safelist(simpleText().simpleText());
        simpleText.addAttributes("class", "style");
        assertEquals(1, document.select(tagName).first().attributes().size());
        verify(document).select(tagName);
    }

}