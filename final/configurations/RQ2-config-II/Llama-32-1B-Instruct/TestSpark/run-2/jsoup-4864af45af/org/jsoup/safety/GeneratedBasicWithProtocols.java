package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedBasicWithProtocols {

    @Test
    public void basicWithProtocols() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.basic(true).addProtocols("", "", "http://www.w3.org/2000/svg", ""));
        assertFalse(safelist.basic(true).isSafeTag("img"));
    }

}