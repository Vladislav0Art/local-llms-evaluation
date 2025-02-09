package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
    }

}