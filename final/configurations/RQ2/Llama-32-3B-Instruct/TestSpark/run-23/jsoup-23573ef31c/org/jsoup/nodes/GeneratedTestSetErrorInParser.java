package org.jsoup.nodes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class GeneratedTestSetErrorInParser {

    @BeforeAll
    public static void beforeAll() {
        Document.create();
    }

    @AfterAll
    public static void afterAll() {
        Document.destroy();
    }

    @Test
    public void testSetErrorInParser() {
        Parser parser = Parser.create();
        parser.setErrorCount(1);
        Assert.assertEquals(1, parser.getErrors());
    }
}

}