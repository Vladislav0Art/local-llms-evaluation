package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedBasic {

    @Test
    public void basic() {
        Safelist safelist = new Safelist();
        assertFalse(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("p"));
    }

}