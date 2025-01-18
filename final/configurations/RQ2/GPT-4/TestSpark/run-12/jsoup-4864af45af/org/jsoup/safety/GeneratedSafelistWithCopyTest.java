package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSafelistWithCopyTest {

    @Test
    public void safelistWithCopyTest() {
        Safelist original = new Safelist();
        Safelist copy = new Safelist(original);
        assertNotNull(original);
        assertNotNull(copy);
    }

}