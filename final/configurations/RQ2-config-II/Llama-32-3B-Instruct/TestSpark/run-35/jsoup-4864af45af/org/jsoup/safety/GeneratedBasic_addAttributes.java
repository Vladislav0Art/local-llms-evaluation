package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedBasic_addAttributes {

    @Test
    public void basic_addAttributes() {
        Safelist list = Safelist.basic();
        Safelist newList = list.addAttributes("p", "style", "color: blue;");
        assertTrue(newList.isSafeAttribute("p", null, new Attribute("style", "color: blue;")));
    }

}