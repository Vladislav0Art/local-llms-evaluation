package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBasicProtocolsTest {

    @Test
    public void basicProtocolsTest() {
        Safelist safeList = Safelist.basic();
        assertFalse(safeList.addProtocols("", ""));
        assertTrue(safeList.addProtocols("", "protocol1=1", "protocol2"));
    }

}