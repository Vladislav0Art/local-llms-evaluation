package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("tag", "attr", "protocol");
        safelist.removeProtocols("tag", "attr", "removeProtocol");
        /* Further implementation based on protocol verification */
    }

}