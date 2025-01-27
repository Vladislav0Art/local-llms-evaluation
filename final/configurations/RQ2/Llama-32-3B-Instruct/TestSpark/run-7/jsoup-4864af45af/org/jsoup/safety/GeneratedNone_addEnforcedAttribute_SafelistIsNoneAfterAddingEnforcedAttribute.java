package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GeneratedNone_addEnforcedAttribute_SafelistIsNoneAfterAddingEnforcedAttribute {

    @Test
    public void none_addEnforcedAttribute_SafelistIsNoneAfterAddingEnforcedAttribute() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addEnforcedAttribute("tag", "attribute", "value");
        Validate.isTrue(safelist.isSafeAttribute("tag", null, null));
    }

}