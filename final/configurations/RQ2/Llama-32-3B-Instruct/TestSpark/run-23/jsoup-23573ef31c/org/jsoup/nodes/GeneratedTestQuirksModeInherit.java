package org.jsoup.nodes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class GeneratedTestQuirksModeInherit {

    @BeforeAll
    public static void beforeAll() {
        Document.create();
    }

    @AfterAll
    public static void afterAll() {
        Document.destroy();
    }

    @Test
    public void testQuirksModeInherit() {
        QuirksMode quirksMode = QuirksMode.INHERIT;
        Assert.assertEquals("inherit", quirksMode.toString());
    }
}

}