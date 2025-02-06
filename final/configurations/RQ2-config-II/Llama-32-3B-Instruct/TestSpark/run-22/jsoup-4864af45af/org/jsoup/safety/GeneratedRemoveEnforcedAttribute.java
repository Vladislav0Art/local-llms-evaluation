package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class GeneratedRemoveEnforcedAttribute {

    @Test
    public void removeEnforcedAttribute() {
        Safelist safelist = Safelist.removeEnforcedAttribute("img", "alt");
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("alt"));
    }

}