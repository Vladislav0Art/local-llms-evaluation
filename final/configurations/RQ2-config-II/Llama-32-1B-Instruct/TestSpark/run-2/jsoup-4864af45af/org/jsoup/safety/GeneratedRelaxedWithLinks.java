package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedRelaxedWithLinks {

    @Test
    public void relaxedWithLinks() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.relativelySanitized());
        assertTrue(safelist.relativelySanitized());
    }

}