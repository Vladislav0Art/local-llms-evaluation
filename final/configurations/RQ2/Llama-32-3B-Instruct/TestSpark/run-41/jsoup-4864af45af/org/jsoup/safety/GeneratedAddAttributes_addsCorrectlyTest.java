package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedAddAttributes_addsCorrectlyTest {

    @Test
    public void addAttributes_addsCorrectlyTest() {
        Set<String> tags = new HashSet<>();
        String[] attributes = {"alt", "src"};
        Safelist safeList = Safelist.basic();
        Attributes result = safeList.addAttributes("img", attributes);
        assertTrue(result.containsAttr("alt"));
        assertTrue(result.containsAttr("src"));
    }

}