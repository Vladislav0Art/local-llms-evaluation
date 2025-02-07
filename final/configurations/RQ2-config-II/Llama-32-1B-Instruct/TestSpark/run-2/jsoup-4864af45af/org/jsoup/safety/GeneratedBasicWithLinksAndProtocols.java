package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedBasicWithLinksAndProtocols {

    @Test
    public void basicWithLinksAndProtocols() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.basic(true).addProtocols("", "", "http://www.w3.org/2000/svg", ""));
        assertTrue(safelist.basicWithImages(true).isSafeTag("img"));
        assertFalse(safelist.basicWithImages(true).isSafeTag("a"));
    }

}