package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedPreserveRelativeLinks_DoNotPreserve {

    @Test
    public void preserveRelativeLinks_DoNotPreserve() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.preserveRelativeLinks());
    }

}