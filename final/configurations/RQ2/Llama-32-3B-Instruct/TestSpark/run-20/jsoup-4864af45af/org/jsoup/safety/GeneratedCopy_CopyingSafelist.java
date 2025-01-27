package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedCopy_CopyingSafelist {

    @Test
    public void copy_CopyingSafelist() {
        Safelist original = Safelist.basic();
        Safelist copy = new Safelist(original);
        assertEquals(original, copy);
    }

}