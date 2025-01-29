package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist none = new Safelist();
        Mockito.when(none.isSafeTag("a")).thenReturn(false);
        boolean result = none.none();
        assertTrue(result);
    }

    @Test
    public void simpleTextTest() {
        Safelist simpleText = new Safelist().simpleText();
        Mockito.when(simpleText.isSafeTag("text")).thenReturn(true);
        boolean result = simpleText.simpleText();
        assertTrue(result);
    }

    @Test
    public void basicTextTest() {
        Safelist basicText = new Safelist().basic().simpleText();
        Mockito.when(basicText.isSafeTag("text")).thenReturn(false);
        boolean result = basicText.basicText().simpleText();
        assertTrue(result);
    }

    @Test
    public void basicTextWithImagesTest() {
        Safelist basicText = new Safelist().basicWithImages().basicText();
        Mockito.when(basicText.isSafeTag("img")).thenReturn(true);
        boolean result = basicText.basicTextWithImages().simpleText();
        assertTrue(result);
    }

    @Test
    public void relaxedTextTest() {
        Safelist relaxedText = new Safelist().relaxed().simpleText();
        Mockito.when(relaxedText.isSafeTag("a")).thenReturn(false);
        boolean result = relaxedText.relaxedText().simpleText();
        assertTrue(result);
    }

    @Test
    public void noneCopyTest() {
        Safelist noneCopy = new Safelist().none().copy();
        Mockito.when(noneCopy.isSafeTag("a")).thenReturn(true);
        boolean result = noneCopy.none().isSafeTag("a");
        assertTrue(result);
    }

    @Test
    public void safeTagsOnlyAddAttributeTest() {
        Safelist safeTagsOnlyAddAttribute = new Safelist().safeTagsOnlyAddAttribute();
        Mockito.when(safeTagsOnlyAddAttribute.isSafeTag("img")).thenReturn(false);
        boolean result = safeTagsOnlyAddAttribute.safeTagsOnlyAddAttribute("img");
        assertTrue(result);
    }

    @Test
    public void noAttributesTest() {
        Safelist noAttributes = new Safelist().noAttributes();
        Mockito.when(noAttributes.getEnforcedAttributes("_a")).thenReturn(new HashSet<>());
        Set<String> result = noAttributes.noAttributes();
        assertEquals(0, result.size());
    }

}