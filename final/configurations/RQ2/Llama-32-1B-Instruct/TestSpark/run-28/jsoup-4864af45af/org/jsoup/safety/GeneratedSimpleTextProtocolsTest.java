package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSimpleTextProtocolsTest {

    @Test
    public void simpleTextProtocolsTest() {
        Safelist safeList = Safelist.simpleText();
        assertFalse(safeList.addProtocols("", ""));
        assertTrue(safeList.addProtocols("", "protocol1=1", "protocol2"));
    }

}