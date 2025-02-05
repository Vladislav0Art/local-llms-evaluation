package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        String[] protocols = {"http, "https"};
                Safelist result = safelist.removeProtocols("tag", "attr", protocols);
        assertNotNull(result);
	}

    }