package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_BreakWords {

    @Test
    public void testWordWrap_BreakWords() {
        Preconditions.checkNotNull(new Reader());

        WordWrap wordWrap = WordWrap.fromClasspathUtf8("break_words.txt");

        assertEquals(0, wordWrap.wordWrap(new BufferedReader(), new OutputStreamWriter(
                        new FileOutputStream(new File("output.txt"))), "", 10000,
                Function.identity(), null, false, true).length());
    }

}