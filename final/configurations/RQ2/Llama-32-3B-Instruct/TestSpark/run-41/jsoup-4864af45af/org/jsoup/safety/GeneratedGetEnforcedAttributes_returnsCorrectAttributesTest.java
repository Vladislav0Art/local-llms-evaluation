package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetEnforcedAttributes_returnsCorrectAttributesTest {

    @Test
    public void getEnforcedAttributes_returnsCorrectAttributesTest() {
        Set<String> tags = new HashSet<>();
        Safelist safeList = Safelist.relaxed();
        String[] attributes = {"alt", "src"};
        Attributes result = safeList.getEnforcedAttributes("img");
        assertTrue(result.containsAttr("alt"));
        assertTrue(result.containsAttr("src"));
    }

}