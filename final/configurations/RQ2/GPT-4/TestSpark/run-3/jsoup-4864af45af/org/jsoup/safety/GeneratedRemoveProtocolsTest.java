package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.none().addProtocols("a", "href", "http", "https").removeProtocols("a", "href", "http");
        // further methods needed to actually test the list of allowed protocols
    }

}