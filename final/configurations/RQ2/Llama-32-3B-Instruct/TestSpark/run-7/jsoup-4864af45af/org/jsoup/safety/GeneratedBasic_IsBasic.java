package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GeneratedBasic_IsBasic {

    @Test
    public void basic_IsBasic() {
        Safelist safelist = Safelist.basic();
        Validate.isTrue(safelist.isSafeTag("tag"));
    }

}