package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GeneratedBasic_addProtocols_SafelistBecomesBasicAfterAddingProtocols {

    @Test
    public void basic_addProtocols_SafelistBecomesBasicAfterAddingProtocols() {
        Safelist safelist = Safelist.basic();
        safelist = Safelist.addProtocols("tag", "attribute", "protocol");
        Validate.isTrue(safelist.isSafeAttribute("tag", null, null));
    }

}