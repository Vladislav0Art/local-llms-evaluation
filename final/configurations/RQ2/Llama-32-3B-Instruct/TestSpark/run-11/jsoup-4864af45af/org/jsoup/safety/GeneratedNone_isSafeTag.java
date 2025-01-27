package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedNone_isSafeTag {

    @Test
    public void none_isSafeTag() {
        assertFalse(Safelist.none().isSafeTag("script"));
    }

}