package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetEnforcedAttributes_returnsEmptySetForNoTagsTest {

    @Test
    public void getEnforcedAttributes_returnsEmptySetForNoTagsTest() {
        String tagName = "";
        Safelist safeList = Safelist.relaxed();
        Attributes result = safeList.getEnforcedAttributes(tagName);
        assertTrue(result.isEmpty());
    }

}