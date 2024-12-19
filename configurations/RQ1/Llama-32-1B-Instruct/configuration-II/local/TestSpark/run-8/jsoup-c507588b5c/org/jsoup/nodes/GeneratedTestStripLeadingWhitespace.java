package org.jsoup.nodes;

public class GeneratedTestStripLeadingWhitespace {

    @Test
    public void testStripLeadingWhitespace() {
        StringBuilder sb = new StringBuilder();
        sb.append("   ");
        assertEquals(4, stripLeadingWhitespace(sb.toString()));
    }

}