package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.safety.Safelist;

import static org.mockito.Mockito.when;

public class GeneratedBasicWithImages_ImagesAreAllowed {

    @Test
    public void basicWithImages_ImagesAreAllowed() {
        Safelist safeList = Safelist.basicWithImages();
        assertTrue(safeList.isSafeTag("img"));
        assertFalse(safeList.isSafeTag("script"));
    }

}