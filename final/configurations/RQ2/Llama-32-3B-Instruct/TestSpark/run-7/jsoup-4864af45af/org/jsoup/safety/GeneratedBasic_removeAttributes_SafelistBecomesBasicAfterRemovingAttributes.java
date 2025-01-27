package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GeneratedBasic_removeAttributes_SafelistBecomesBasicAfterRemovingAttributes {

    @Test
    public void basic_removeAttributes_SafelistBecomesBasicAfterRemovingAttributes() {
        Safelist safelist = Safelist.basic();
        safelist = Safelist.removeAttributes("tag", "attribute");
        Validate.isTrue(safelist.isSafeTag("img"));
    }

}