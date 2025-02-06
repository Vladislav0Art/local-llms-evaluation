package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedRemoveProtocols_RemovesProtocolsFromSafelist {

    @Test
    public void removeProtocols_RemovesProtocolsFromSafelist() {
        Safelist safelist = Safelist.none();
        Set<String> protocols = new HashSet<>();
        protocols.add("http");
        safelist = safelist.removeProtocols("a", "href", protocols.toArray(new String[0]));
        assertFalse(safelist.getEnforcedAttributes("a").containsKey("href"));
    }

}