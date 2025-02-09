package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedRelaxedTest {

    @Test
    public void relaxedTest() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
    }

}