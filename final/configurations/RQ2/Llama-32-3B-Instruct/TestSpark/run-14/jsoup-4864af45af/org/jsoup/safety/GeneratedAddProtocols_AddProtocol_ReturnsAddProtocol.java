package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedAddProtocols_AddProtocol_ReturnsAddProtocol {

    @Test
    public void addProtocols_AddProtocol_ReturnsAddProtocol() {
        Safelist result = Safelist.addProtocols("img", "src", "http://example.com");
        assertTrue(Arrays.asList(result.getEnforcedAttributes("img").get("src")).contains("http://example.com"));
    }

}