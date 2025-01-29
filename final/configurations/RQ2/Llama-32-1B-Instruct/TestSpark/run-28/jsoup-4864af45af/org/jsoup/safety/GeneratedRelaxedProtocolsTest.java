package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRelaxedProtocolsTest {

    @Test
    public void relaxedProtocolsTest() {
        Safelist safeList = Safelist.relaxed();
        assertFalse(safeList.addProtocols("", ""));
        assertTrue(safeList.addProtocols("", "protocol1=1", "protocol2"));
    }

}