package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GeneratedSimpleText_IsSimpleText {

    @Test
    public void simpleText_IsSimpleText() {
        Safelist safelist = Safelist.simpleText();
        Validate.isTrue(safelist.isSafeTag("text"));
    }

}