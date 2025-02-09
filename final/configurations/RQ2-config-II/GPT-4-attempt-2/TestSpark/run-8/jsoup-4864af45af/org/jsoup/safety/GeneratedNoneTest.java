package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
    }

}