package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedSimpleText {

    @Test
    public void simpleText() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.simpleText().isSafeTag("text"));
        assertFalse(safelist.simpleText().isSafeTag("img"));
    }

}