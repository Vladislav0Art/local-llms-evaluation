package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedNone_isNone {

    @Test
    public void none_isNone() {
        Safelist list = Safelist.none();
        assertEquals(Safelist.none(), list);
    }

}