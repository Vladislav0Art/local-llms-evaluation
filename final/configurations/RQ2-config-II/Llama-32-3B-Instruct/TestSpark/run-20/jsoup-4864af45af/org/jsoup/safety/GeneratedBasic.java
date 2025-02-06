package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedBasic {

    @Test
    public void basic() {
        Attributes attributes = new Attributes();
        attributes.put("href", "http://example.com");
        Safelist result = Safelist.basic().addAttributes("a", "href", "http://example.com");
        assertTrue(Safelist.BASIC.equals(result));
        assertEquals(1, result.getEnforcedAttributes("a").size());
    }

}