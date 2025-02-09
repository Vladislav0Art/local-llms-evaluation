package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedBasicTest {

    @Test
    public void basicTest() {
        Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
    }

}