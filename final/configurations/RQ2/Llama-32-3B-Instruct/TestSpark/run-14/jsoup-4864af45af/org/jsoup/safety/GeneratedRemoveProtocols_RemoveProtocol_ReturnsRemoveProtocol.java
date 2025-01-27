package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedRemoveProtocols_RemoveProtocol_ReturnsRemoveProtocol {

    @Test
    public void removeProtocols_RemoveProtocol_ReturnsRemoveProtocol() {
        Safelist result = new Safelist().removeProtocols("img", "src", Arrays.asList("http://example.com"));
        assertFalse(result.getEnforcedAttributes("img").get("src").contains("http://example.com"));
    }

}