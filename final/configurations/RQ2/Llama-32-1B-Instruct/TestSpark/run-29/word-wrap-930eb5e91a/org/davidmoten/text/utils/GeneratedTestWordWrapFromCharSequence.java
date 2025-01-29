package org.davidmoten.text.utils;

public class GeneratedTestWordWrapFromCharSequence {

    @Test
    public void testWordWrapFromCharSequence() {
        Preconditions.checkNotNull(new StringReader(new char[]{'a', 'b'}));
        Preconditions.checkNotNull(new PrintStream(new OutputStreamWriter(System.out)));
        StringBuilder sb = new StringBuilder();
        WordWrap.wordWrap(new BufferedReader(new InputStreamReader(System.in)), new OutputStreamWriter(System.out), "\n", 20, null, null, true, false);
        assertEquals("ab\nba", WordWrap.rightTrim(sb.toString()));
    }

}