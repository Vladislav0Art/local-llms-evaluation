package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        Safelist safelist = Safelist.relaxed();
        Safelist safelistCopy = new Safelist(safelist);
        assertTrue(safelistCopy.isSafeTag("img"));
    }

}