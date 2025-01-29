package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.*;

public class GeneratedAddEnforcedAttribute {

    private Document document = new Document();
    private String tagName;

    @Test
    public void addEnforcedAttribute() {
        when(document.select(tagName).first()).thenReturn(new Element("p"));
        Safelist simpleText = new Safelist(simpleText().simpleText());
        simpleText.addEnforcedAttribute("class", "my-class");
        assertEquals(1, document.select(tagName).first().attributes().size());
        verify(document).select(tagName);
    }

}