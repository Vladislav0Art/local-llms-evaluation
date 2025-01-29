package org.davidmoten.text.utils;

public class GeneratedTestFromReader {

    private WordWrap wordWrap;
    private Reader reader;

    @Test
    public void testFromReader() throws IOException {
        wordWrap = new Builder().from(new InputStreamReader(new FileInputStream("test.txt")));
        assertNotNull(wordWrap);
    }

}