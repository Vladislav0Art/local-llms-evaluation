package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedNone_removeEnforcedAttribute {

    @Test
    public void none_removeEnforcedAttribute() {
        Safelist list = Safelist.none();
        Safelist newList = list.removeEnforcedAttribute("script", "src");
        assertFalse(newList.isSafeAttribute("script", null, new Attribute("src", null)));
    }

}