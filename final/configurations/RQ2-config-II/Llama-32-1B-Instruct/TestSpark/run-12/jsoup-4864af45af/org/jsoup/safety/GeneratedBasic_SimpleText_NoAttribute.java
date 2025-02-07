package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class GeneratedBasic_SimpleText_NoAttribute {

    @Test
    public void basic_SimpleText_NoAttribute() {
        Safelist safelist = Safelist.basic();
        assertNull(safelist.addAttributes(""));
    }

}