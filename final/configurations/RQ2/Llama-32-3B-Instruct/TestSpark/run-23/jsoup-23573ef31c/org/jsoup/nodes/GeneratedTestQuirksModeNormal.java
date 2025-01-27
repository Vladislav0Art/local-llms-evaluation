package org.jsoup.nodes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class GeneratedTestQuirksModeNormal {

    @BeforeAll
    public static void beforeAll() {
        Document.create();
    }

    @AfterAll
    public static void afterAll() {
        Document.destroy();
    }

    @Test
    public void testQuirksModeNormal() {
        QuirksMode quirksMode = QuirksMode.NORMAL;
        Assert.assertEquals("normal", quirksMode.toString());
    }

}