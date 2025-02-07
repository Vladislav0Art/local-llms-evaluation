package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class GeneratedNone_Relaxed_Basic {

    @Test
    public void none_Relaxed_Basic() {
        Safelist none = new SafeList();
        assertNull(none.addTags("a", "b"));
    }

}