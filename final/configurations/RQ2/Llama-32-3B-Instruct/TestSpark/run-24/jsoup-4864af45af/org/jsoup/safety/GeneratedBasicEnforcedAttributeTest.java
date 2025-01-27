package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedBasicEnforcedAttributeTest {

    @Test
    public void basicEnforcedAttributeTest() {
        Safelist sut = Safelist.basic();
        assertEquals(Validate.ATTRIBUTE, new HashSet<>(Arrays.asList(sut.getEnforcedAttributes("html").getKeys())));
    }

}