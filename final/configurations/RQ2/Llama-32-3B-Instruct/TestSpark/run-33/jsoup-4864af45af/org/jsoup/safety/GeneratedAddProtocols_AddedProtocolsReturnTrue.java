package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedAddProtocols_AddedProtocolsReturnTrue {

    @Test
    public void addProtocols_AddedProtocolsReturnTrue() {
        Safelist result = new Safelist();
        result = result.addProtocols("a", "href", "https://example.com", "http://example.org");
        assertTrue(result.getEnforcedAttributes("a").containsKey("href"));
    }

}