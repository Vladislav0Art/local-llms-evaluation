package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GeneratedBasic_removeEnforcedAttribute_SafelistBecomesBasicAfterRemovingEnforcedAttribute {

    @Test
    public void basic_removeEnforcedAttribute_SafelistBecomesBasicAfterRemovingEnforcedAttribute() {
        Safelist safelist = Safelist.basic();
        safelist = Safelist.removeEnforcedAttribute("tag", "attribute");
        Validate.isTrue(safelist.isSafeTag("img"));
    }

}