package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedIsSafeAttribute_returnsTrueForAllowedAttributesTest {

    @Test
    public void isSafeAttribute_returnsTrueForAllowedAttributesTest() {
        Set<String> tags = new HashSet<>();
        String[] allowedAttributes = {"alt", "src"};
        Safelist safeList = Safelist.relaxed();
        for (String tag : tags) {
            assertTrue(safeList.isSafeAttribute(tag, null, new Attribute("allowedAttr", "value")));
        }
    }

}