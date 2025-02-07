package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedNoneWithLinks {

    @Test
    public void noneWithLinks() {
        Safelist safelist = new Safelist();
        assertEquals(null, safelist.none(true));
    }

}