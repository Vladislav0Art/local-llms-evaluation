package org.jsoup.nodes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class GeneratedTestDestroyDocument {

    @BeforeAll
    public static void beforeAll() {
        Document.create();
    }

    @AfterAll
    public static void afterAll() {
        Document.destroy();
    }

    @Test
    public void testDestroyDocument() {
        Document.destroy();
    }
}

}