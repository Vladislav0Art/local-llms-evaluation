package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        Safelist safelist = new Safelist();
        assertFalse(safelist.isSafeTag("tag"));
    }

}