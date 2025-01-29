package org.jsoup.nodes;

public class GeneratedTestLastCharIsWhitespace {

    @Test
    public void testLastCharIsWhitespace() {
        StringBuilder sb = new StringBuilder("   ");
        boolean expectedOutput = true;
        assertTrue(TestUtils.lastCharIsWhitespace(sb));
    }

}