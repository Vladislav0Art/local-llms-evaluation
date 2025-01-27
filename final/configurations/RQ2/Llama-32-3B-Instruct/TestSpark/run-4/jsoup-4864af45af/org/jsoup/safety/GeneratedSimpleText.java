package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedSimpleText {

    @Test
    public void simpleText() {
        Safelist simpleText = Safelist.simpleText();
        assertTrue(simpleText.isSafeTag("span"));
    }

}