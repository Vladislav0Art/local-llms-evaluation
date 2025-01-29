package org.davidmoten.text.utils;

public class GeneratedTestFromUtf8 {

    private WordWrap wordWrap;
    private Reader reader;

    @Test
    public void testFromUtf8() throws IOException {
        wordWrap = new Builder().fromUtf8(new FileInputStream("test.txt"));
        assertNotNull(wordWrap);
    }

}