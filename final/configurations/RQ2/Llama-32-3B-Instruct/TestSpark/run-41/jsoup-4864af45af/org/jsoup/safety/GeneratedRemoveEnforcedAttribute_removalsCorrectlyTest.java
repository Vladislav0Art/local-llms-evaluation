package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedRemoveEnforcedAttribute_removalsCorrectlyTest {

    @Test
    public void removeEnforcedAttribute_removalsCorrectlyTest() {
        Set<String> tags = new HashSet<>();
        String[] attributes = {"alt"};
        Safelist safeList = Safelist.basic();
        Attributes result = safeList.addAttributes("img", attributes);
        assertFalse(safeList.removeEnforcedAttribute("img", "alt"));
    }

}