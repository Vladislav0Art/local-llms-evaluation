package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GeneratedNone_addAttributes_SafelistIsNoneAfterAddingAttributes {

    @Test
    public void none_addAttributes_SafelistIsNoneAfterAddingAttributes() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addAttributes("tag", "attribute");
        Validate.isTrue(safelist.isSafeAttribute("tag", null, null));
    }

}