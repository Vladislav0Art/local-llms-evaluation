package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class GeneratedNone_SimpleText_NoTags {

    @Test
    public void none_SimpleText_NoTags() {
        Safelist none = new SafeList();
        assertNotNull(none.getEnforcedAttributes("test"));
    }

}