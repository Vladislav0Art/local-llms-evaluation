package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_RightTrim {

    @Test
    public void testWordWrap_RightTrim() {
        Preconditions.checkNotNull(new StringBuilder());

        WordWrap wordWrap = WordWrap.fromClasspathUtf8("right_trim.txt");

        assertEquals(0, wordWrap.wordWrap(new BufferedReader(), new OutputStreamWriter(
                        new FileOutputStream(new File("output.txt"))), "", 10000,
                Function.identity(), null, false, true).length());
    }

}