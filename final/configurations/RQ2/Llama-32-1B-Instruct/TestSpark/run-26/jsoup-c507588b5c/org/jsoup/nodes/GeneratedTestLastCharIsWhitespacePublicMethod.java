package org.jsoup.nodes;

public class GeneratedTestLastCharIsWhitespacePublicMethod {

    @Test
    public void testLastCharIsWhitespacePublicMethod() {
        StringBuilder sb = new StringBuilder("   ");
        boolean expectedOutput = true;
        assertTrue(TestUtils.lastCharIsWhitespace(sb));
    }

}