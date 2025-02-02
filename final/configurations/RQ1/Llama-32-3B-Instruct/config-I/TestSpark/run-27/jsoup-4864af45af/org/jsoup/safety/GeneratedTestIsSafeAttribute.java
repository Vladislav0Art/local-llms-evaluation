package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestIsSafeAttribute {

    private Config config = new Config();

    @Test
    public void testIsSafeAttribute() {
        Element el = new Element();
        Attribute attr = new Attribute("href", "http://example.com");
        Assert.assertTrue(config.isSafeAttribute(All, el, attr));
    }

}