package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_LeftTrim {

    @Test
    public void testWordWrap_LeftTrim() {
        Preconditions.checkNotNull(new StringBuilder());

        WordWrap wordWrap = WordWrap.fromClasspathUtf8("left_trim.txt");

        assertEquals(0, wordWrap.wordWrap(new BufferedReader(), new OutputStreamWriter(
                        new FileOutputStream(new File("output.txt"))), "", 10000,
                Function.identity(), null, false, true).length());
    }

}