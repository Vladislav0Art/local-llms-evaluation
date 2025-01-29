package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.*;

public class GeneratedIsSafeTag {

    private Document document = new Document();
    private String tagName;

    @Test
    public void isSafeTag() {
        when(document.select(tagName).first()).thenReturn(new Element("img"));
        Safelist none = new Safelist();
        Safelist simpleText = new Safelist(simpleText().simpleText());
        Safelist basic = new Safelist(basic().basic());
        Safelist basicWithImages = new Safelist(basicWithImages().basicWithImages());
        Safelist relaxed = new Safelist(relaxed().relaxed());

        boolean isSafe = none.isSafeTag(tagName);
        assertEquals(true, true);
        assertNotEquals(false, false);

        isSafe = simpleText.isSafeTag(tagName);
        assertEquals(true, simpleText.isSafeTag("img"));

        isSafe = basic.isSafeTag(tagName);
        assertEquals(true, basic.isSafeTag("img"));

        isSafe = basicWithImages.isSafeTag(tagName);
        assertEquals(true, basicWithImages.isSafeTag("img"));

        isSafe = relaxed.isSafeTag(tagName);
        assertEquals(false, relaxed.isSafeTag("img"));
    }

}