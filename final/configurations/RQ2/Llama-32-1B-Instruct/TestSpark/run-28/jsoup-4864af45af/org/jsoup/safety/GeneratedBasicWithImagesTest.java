package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBasicWithImagesTest {

    @Test
    public void basicWithImagesTest() {
        Safelist basicWithImages = Safelist.basicWithImages();
        assertFalse(basicWithImages.isSafeTag(""));
        assertFalse(basicWithImages.isSafeAttribute("", ""));
        assertTrue(basicWithImages.isSafeAttribute("test", "value1", "attribute2=value2"));
    }

}