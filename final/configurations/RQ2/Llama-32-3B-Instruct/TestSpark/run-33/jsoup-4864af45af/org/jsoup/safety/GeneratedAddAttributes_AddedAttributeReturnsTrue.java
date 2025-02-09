package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedAddAttributes_AddedAttributeReturnsTrue {

    @Test
    public void addAttributes_AddedAttributeReturnsTrue() {
        Safelist result = new Safelist();
        result = result.addAttributes("img", "alt", "image");
        assertTrue(result.getEnforcedAttributes("img").containsKey("alt"));
    }

}