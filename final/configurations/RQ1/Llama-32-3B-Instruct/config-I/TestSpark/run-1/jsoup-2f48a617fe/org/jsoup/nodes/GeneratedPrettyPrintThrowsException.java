package org.jsoup.nodes;

public class GeneratedPrettyPrintThrowsException {

    @Test
    public void prettyPrintThrowsException() {
        try {
            settings.prettyPrint();
            fail("Expected exception");
        } catch (Exception e) {
            // expected
        }
    }

}