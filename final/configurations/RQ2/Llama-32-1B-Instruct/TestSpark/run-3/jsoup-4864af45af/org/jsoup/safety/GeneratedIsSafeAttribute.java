package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.*;

public class GeneratedIsSafeAttribute {

    private Document document = new Document();
    private String tagName;

    @Test
    public void isSafeAttribute() {
        when(document.select(tagName).first()).thenReturn(new Element("a"));
        Safelist none = new Safelist();
        Safelist simpleText = new Safelist(simpleText().simpleText());
        Safelist basic = new Safelist(basic().basic());

        boolean isSafe = none.isSafeAttribute(tagName);
        assertEquals(true, true);
        assertNotEquals(false, false);

        isSafe = simpleText.isSafeAttribute(tagName);
        assertEquals(true, simpleText.isSafeAttribute("a"));

        isSafe = basic.isSafeAttribute(tagName);
        assertEquals(true, basic.isSafeAttribute("a"));

        isSafe = basicWithImages.isSafeAttribute(tagName);
        assertEquals(true, basicWithImages.isSafeAttribute("a"));
    }

}