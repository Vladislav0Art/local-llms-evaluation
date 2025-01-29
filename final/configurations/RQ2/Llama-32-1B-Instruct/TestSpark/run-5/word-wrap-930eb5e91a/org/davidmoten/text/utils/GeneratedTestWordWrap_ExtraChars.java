package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_ExtraChars {

    @Test
    public void testWordWrap_ExtraChars() {
        Preconditions.checkNotNull(new Reader());

        WordWrap wordWrap = new WordWrap();
        assertEquals(0, wordWrap.wordWrap(new BufferedReader(), new OutputStreamWriter(
                        new FileOutputStream(new File("output.txt"))), "", 10000,
                Function.identity(), null, false, true).length());
    }

}