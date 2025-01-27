package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GeneratedBasic_removeTags_SafelistBecomesBasicAfterRemovingTags {

    @Test
    public void basic_removeTags_SafelistBecomesBasicAfterRemovingTags() {
        Safelist safelist = Safelist.basic();
        safelist = Safelist.removeTags("tag");
        Validate.isTrue(safelist.isSafeTag("img"));
    }

}