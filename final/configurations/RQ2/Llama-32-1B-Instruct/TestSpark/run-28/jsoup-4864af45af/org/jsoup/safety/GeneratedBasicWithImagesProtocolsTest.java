package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBasicWithImagesProtocolsTest {

    @Test
    public void basicWithImagesProtocolsTest() {
        Safelist safeList = Safelist.basicWithImages();
        assertFalse(safeList.addProtocols("", ""));
        assertTrue(safeList.addProtocols("", "protocol1=1", "protocol2"));
    }

}