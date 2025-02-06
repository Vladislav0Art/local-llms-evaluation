package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedBasic_SelfTest {

    @Test
    public void basic_SelfTest() {
        Safelist safelist = Safelist.none();
        assertEquals(safelist, Safelist.none());
    }

}