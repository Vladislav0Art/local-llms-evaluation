package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedRelaxed {

    @Test
    public void relaxed() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.relativelySanitized());
        assertFalse(safelist.relativelySanitized());
    }

}