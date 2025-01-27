package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GeneratedNone_removeProtocols_SafelistIsNoneAfterRemovingProtocols {

    @Test
    public void none_removeProtocols_SafelistIsNoneAfterRemovingProtocols() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.removeProtocols("tag", "attribute", "removeProtocol");
        Validate.isTrue(safelist.isSafeAttribute(null, null, null));
    }

}