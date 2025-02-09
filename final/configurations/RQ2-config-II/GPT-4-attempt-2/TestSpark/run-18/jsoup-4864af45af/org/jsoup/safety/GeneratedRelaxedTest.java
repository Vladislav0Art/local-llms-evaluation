package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedRelaxedTest {

    @Test
    public void relaxedTest() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
    }

}