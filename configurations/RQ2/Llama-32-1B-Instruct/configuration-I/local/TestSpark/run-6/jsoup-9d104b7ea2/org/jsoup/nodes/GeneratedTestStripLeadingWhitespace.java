package org.jsoup.nodes;

public class GeneratedTestStripLeadingWhitespace {

    @Test
    public void testStripLeadingWhitespace() {
        StringBuilder sb = new StringBuilder();
        sb.append("   Hello World   ");
        assertEquals("Hello World", stripLeadingWhitespace(sb.toString()));
    }

}