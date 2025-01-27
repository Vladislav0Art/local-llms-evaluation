package org.jsoup.nodes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class GeneratedTestCharsetForUTF8 {

    @BeforeAll
    public static void beforeAll() {
        Document.create();
    }

    @AfterAll
    public static void afterAll() {
        Document.destroy();
    }

    @Test
    public void testCharsetForUTF8() {
        Charset charset = Charset.forName("UTF-8");
        Assert.assertEquals("UTF-8", charset.name());
    }

}