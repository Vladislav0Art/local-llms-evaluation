package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedIsSafeTag_EmptyString_Safe {

    @Test
    public void isSafeTag_EmptyString_Safe() {
        assertTrue(Safelist.none().isSafeTag(""));
    }

}