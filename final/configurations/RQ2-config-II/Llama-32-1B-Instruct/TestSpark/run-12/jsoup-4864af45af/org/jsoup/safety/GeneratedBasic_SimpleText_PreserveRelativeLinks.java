package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class GeneratedBasic_SimpleText_PreserveRelativeLinks {

    @Test
    public void basic_SimpleText_PreserveRelativeLinks() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.preserveRelativeLinks(true));
    }

}