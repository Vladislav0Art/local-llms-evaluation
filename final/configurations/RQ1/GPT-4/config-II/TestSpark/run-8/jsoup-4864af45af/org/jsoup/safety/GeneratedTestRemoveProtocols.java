package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestRemoveProtocols {

    private static final String ALL = "all";
    private static final String TEST_TAG = "a";
    private static final String TEST_ATTR = "href";
    private static final String TEST_PROTOCOL = "http";

    @Test
    public void testRemoveProtocols() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeProtocols(TEST_TAG, TEST_ATTR, TEST_PROTOCOL);

        assertTrue(!safelist.protocols.get(TEST_TAG).get(TEST_ATTR).contains(TEST_PROTOCOL));
    }

}