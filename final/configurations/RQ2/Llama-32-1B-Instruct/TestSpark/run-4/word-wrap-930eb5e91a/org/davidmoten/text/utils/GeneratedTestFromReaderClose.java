package org.davidmoten.text.utils;

public class GeneratedTestFromReaderClose {

    private WordWrap wordWrap;
    private Reader reader;

    @Test
    public void testFromReaderClose() throws IOException {
        Preconditions.checkArgument(wordWrap instanceof WordWrap.Builder);
        Reader reader = new InputStreamReader(new FileInputStream("test.txt"));
        wordWrap = new WordWrap.Builder().from(reader, true).close(reader);
        assertNotNull(wordWrap);
    }

}