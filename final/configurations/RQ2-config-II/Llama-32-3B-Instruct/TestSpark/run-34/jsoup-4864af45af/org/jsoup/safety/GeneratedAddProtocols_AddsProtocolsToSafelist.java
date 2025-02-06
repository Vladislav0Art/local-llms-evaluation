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

public class GeneratedAddProtocols_AddsProtocolsToSafelist {

    @Test
    public void addProtocols_AddsProtocolsToSafelist() {
        Safelist safelist = Safelist.none();
        Set<String> protocols = new HashSet<>();
        protocols.add("http");
        safelist = safelist.addProtocols("a", "href", protocols.toArray(new String[0]));
        assertTrue(safelist.getEnforcedAttributes("a").containsKey("href"));
    }

}