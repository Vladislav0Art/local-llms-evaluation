package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedRemoveProtocols_RemovedProtocolsReturnFalse {

    @Test
    public void removeProtocols_RemovedProtocolsReturnFalse() {
        Safelist result = new Safelist();
        result = result.removeProtocols("a", "href", "https://example.com");
        assertFalse(result.getEnforcedAttributes("a").containsKey("href"));
    }

}