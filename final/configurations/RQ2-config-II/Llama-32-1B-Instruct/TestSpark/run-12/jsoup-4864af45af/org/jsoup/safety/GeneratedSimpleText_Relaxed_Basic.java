package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class GeneratedSimpleText_Relaxed_Basic {

    @Test
    public void simpleText_Relaxed_Basic() {
        Safelist safelist = Safelist.relativelyUnsafe().copy();
        assertNotNull(safelist.addTags("a", "b"));
    }

}