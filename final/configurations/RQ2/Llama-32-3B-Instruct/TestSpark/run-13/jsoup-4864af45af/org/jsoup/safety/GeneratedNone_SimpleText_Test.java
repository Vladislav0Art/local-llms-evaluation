package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedNone_SimpleText_Test {

    @Test
    public void none_SimpleText_Test() {
        Safelist safelist = Safelist.safelist();
        assertTrue(safelist.isSimpleText());
    }

}