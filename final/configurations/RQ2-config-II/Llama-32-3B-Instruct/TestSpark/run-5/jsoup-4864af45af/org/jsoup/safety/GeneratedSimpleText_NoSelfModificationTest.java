package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedSimpleText_NoSelfModificationTest {

    @Test
    public void simpleText_NoSelfModificationTest() {
        Safelist safelist = Safelist.simpleText();
        safelist.addTags("a");
        assertFalse(Safelist.isSafeTag("a"));
    }

}