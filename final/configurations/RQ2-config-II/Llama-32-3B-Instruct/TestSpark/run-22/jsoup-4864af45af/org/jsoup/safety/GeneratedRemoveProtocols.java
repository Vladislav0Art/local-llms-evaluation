package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class GeneratedRemoveProtocols {

    @Test
    public void removeProtocols() {
        Safelist safelist = Safelist.removeProtocols("img", "src", new String[]{"http://example.com"});
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("src"));
    }

}