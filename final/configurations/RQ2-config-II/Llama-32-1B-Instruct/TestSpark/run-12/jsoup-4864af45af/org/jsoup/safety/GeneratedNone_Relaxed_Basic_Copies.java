package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class GeneratedNone_Relaxed_Basic_Copies {

    @Test
    public void none_Relaxed_Basic_Copies() {
        Safelist copy = Safelist.none().copy();
        assertNotNull(copy.getEnforcedAttributes("test"));
    }

}