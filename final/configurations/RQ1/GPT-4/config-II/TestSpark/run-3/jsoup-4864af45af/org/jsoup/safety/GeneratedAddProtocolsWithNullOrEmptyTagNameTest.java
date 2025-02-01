package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedAddProtocolsWithNullOrEmptyTagNameTest {

    @Test
    public void AddProtocolsWithNullOrEmptyTagNameTest() throws Exception {
        Safelist safelist = Safelist.simpleText();
        safelist.addProtocols("", "href", "http");
    }

}