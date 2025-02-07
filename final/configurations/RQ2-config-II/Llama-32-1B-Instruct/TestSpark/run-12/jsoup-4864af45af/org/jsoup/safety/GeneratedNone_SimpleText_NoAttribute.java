package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class GeneratedNone_SimpleText_NoAttribute {

    @Test
    public void none_SimpleText_NoAttribute() {
        Safelist none = new SafeList();
        assertNull(none.addAttributes(""));
    }

}