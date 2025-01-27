package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GeneratedNone_SafelistIsNone {

    @Test
    public void none_SafelistIsNone() {
        Safelist safelist = Safelist.none();
        Validate.isTrue(safelist.isSafeTag("tag"));
    }

}