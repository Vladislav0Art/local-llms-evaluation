package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.junit.Test;

public class GeneratedBasic_SimpleTagsAndAttributes_removeProtocols {

    @Test
    public void basic_SimpleTagsAndAttributes_removeProtocols() {
        Safelist safeList = Safelist.basic();
        safeList.removeProtocols("a", new String[]{});
        assertFalse(safeList.isSafeAttribute("a", null, new Attribute("", "", "")));
    }

}