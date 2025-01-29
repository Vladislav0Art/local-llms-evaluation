package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_NonUtf8Reader_WithoutMaxWidth {

    @Test
    public void testWordWrap_NonUtf8Reader_WithoutMaxWidth() {
        Preconditions.checkNotNull(new BufferedReader());
        Preconditions.checkNotNull(new Writer());

        WordWrap wordWrap = new WordWrap();
        assertEquals(0, wordWrap.wordWrap(new BufferedReader(), new OutputStreamWriter(
                        new FileOutputStream(new File("output.txt"))), "", 10000,
                Function.identity(), null, false, true).length());
    }

}