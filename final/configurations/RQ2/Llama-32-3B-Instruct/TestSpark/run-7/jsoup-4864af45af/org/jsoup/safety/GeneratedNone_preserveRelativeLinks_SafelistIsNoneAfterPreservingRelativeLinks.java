package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GeneratedNone_preserveRelativeLinks_SafelistIsNoneAfterPreservingRelativeLinks {

    @Test
    public void none_preserveRelativeLinks_SafelistIsNoneAfterPreservingRelativeLinks() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.preserveRelativeLinks(true);
        Validate.isTrue(safelist.isSafeAttribute(null, null, null));
    }

}