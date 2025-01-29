package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNoneProtocolsTest {

    @Test
    public void noneProtocolsTest() {
        Safelist none = new Safelist();
        none.addProtocols("", "");
        assertTrue(none.preserveRelativeLinks(false));
    }

}