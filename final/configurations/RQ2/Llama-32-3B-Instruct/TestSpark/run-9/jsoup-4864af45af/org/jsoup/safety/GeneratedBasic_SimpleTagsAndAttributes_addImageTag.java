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

public class GeneratedBasic_SimpleTagsAndAttributes_addImageTag {

    @Test
    public void basic_SimpleTagsAndAttributes_addImageTag() {
        Safelist safeList = Safelist.basic();
        safeList.addAttributes("img", new String[]{"src"});
        assertTrue(safeList.isSafeAttribute("img", null, new Attribute("", "", "")));
    }

}