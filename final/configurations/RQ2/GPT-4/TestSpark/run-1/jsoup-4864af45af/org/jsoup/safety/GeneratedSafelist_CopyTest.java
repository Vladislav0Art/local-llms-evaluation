package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSafelist_CopyTest {

    @Test
    public void Safelist_CopyTest() {
        Safelist original = Safelist.basic();
        Safelist copy = new Safelist(original);
        assertNotNull(copy);
    }

}