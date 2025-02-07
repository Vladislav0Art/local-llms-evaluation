package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedRelaxedWithLinksAndProtocols {

    @Test
    public void relaxedWithLinksAndProtocols() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.relativelySanitized());
        assertTrue(safelist.relativelySanitized());
        assertTrue(safelist.relativelySanitized());
    }

}