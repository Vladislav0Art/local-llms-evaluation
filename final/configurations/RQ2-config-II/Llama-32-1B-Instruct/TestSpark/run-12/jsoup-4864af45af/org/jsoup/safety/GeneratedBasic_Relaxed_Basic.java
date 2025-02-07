package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class GeneratedBasic_Relaxed_Basic {

    @Test
    public void basic_Relaxed_Basic() {
        Safelist safelist = Safelist.basic().copy();
        assertNotNull(safelist.addTags("a", "b"));
    }

}