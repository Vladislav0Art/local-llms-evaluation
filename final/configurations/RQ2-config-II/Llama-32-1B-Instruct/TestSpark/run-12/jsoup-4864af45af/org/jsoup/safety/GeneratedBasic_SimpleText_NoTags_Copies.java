package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class GeneratedBasic_SimpleText_NoTags_Copies {

    @Test
    public void basic_SimpleText_NoTags_Copies() {
        Safelist copy = Safelist.basic().copy();
        assertNotNull(copy.getEnforcedAttributes("test"));
    }

}