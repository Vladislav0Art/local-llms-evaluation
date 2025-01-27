package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedAddAttributes_AddAttribute_ReturnsAddAttribute {

    @Test
    public void addAttributes_AddAttribute_ReturnsAddAttribute() {
        Safelist result = Safelist.addAttributes("img", "alt", "image.jpg");
        assertTrue(result.getEnforcedAttributes("img").contains("alt=\"image.jpg\""));
    }

}