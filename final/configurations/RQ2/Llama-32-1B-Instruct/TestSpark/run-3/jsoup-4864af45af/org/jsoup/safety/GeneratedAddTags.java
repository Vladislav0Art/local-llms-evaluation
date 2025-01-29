package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.*;

public class GeneratedAddTags {

    private Document document = new Document();
    private String tagName;

    @Test
    public void addTags() {
        when(document.select(tagName).first()).thenReturn(new Element("p"));
        Safelist simpleText = new Safelist(simpleText().simpleText());
        simpleText.addTags("span");
        assertEquals(1, document.select(tagName).first().children().size());
        verify(document).select(tagName);
    }

}