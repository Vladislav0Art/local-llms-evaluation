package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedPreserveRelativeLinks_Preserve {

    @Test
    public void preserveRelativeLinks_Preserve() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.preserveRelativeLinks());
    }

}