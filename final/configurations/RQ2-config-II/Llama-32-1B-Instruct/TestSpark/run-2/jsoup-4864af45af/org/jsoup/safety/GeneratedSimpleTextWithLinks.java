package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedSimpleTextWithLinks {

    @Test
    public void simpleTextWithLinks() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.simpleText().isSafeTag("a"));
        assertFalse(safelist.simpleText().isSafeTag("img"));
    }

}