package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedBasic_removeAttributes {

    @Test
    public void basic_removeAttributes() {
        Safelist list = Safelist.basic();
        Safelist newList = list.removeAttributes("p", "style");
        assertFalse(newList.isSafeAttribute("p", null, new Attribute("style", null)));
    }

}