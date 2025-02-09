package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.mockito.Mockito;

public class GeneratedGetEnforcedAttributes_ReturnsEmptyMap {

    @Test
    public void getEnforcedAttributes_ReturnsEmptyMap() {
        Safelist result = new Safelist();
        assertEquals(new HashMap<>(), result.getEnforcedAttributes());
    }

}