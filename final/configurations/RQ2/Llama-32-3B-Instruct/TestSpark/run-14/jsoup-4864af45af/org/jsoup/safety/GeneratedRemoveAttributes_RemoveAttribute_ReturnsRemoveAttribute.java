package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedRemoveAttributes_RemoveAttribute_ReturnsRemoveAttribute {

    @Test
    public void removeAttributes_RemoveAttribute_ReturnsRemoveAttribute() {
        Safelist result = Safelist.removeAttributes("img", "alt");
        assertFalse(result.getEnforcedAttributes("img").contains("alt"));
    }

}