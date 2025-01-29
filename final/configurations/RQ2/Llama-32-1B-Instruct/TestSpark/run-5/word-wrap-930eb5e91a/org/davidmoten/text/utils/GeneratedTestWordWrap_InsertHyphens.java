package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_InsertHyphens {

    @Test
    public void testWordWrap_InsertHyphens() {
        Preconditions.checkNotNull(new Reader());

        WordWrap wordWrap = WordWrap.fromClasspathUtf8("insert_hyphens.txt");

        assertEquals(0, wordWrap.wordWrap(new BufferedReader(), new OutputStreamWriter(
                        new FileOutputStream(new File("output.txt"))), "", 10000,
                Function.identity(), null, false, true).length());
    }

}