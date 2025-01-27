package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GeneratedRelaxed_IsRelaxed {

    @Test
    public void relaxed_IsRelaxed() {
        Safelist safelist = Safelist.relaxed();
        Validate.isTrue(safelist.isSafeTag("script"));
    }

}