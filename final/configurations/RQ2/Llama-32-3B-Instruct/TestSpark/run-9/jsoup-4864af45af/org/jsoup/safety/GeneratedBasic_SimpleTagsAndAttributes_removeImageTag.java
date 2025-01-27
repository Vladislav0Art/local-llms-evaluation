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

public class GeneratedBasic_SimpleTagsAndAttributes_removeImageTag {

    @Test
    public void basic_SimpleTagsAndAttributes_removeImageTag() {
        Safelist safeList = Safelist.basic();
        safeList.removeAttributes("img", new String[]{});
        assertFalse(safeList.isSafeAttribute("img", null, new Attribute("", "", "")));
    }

}