package org.davidmoten.text.utils;

public class GeneratedTestFromInputStream {

    private WordWrap wordWrap;
    private Reader reader;

    @Test
    public void testFromInputStream() throws IOException {
        Preconditions.checkArgument(wordWrap instanceof WordWrap.Builder);
        InputStream in = new FileInputStream("test.txt");
        wordWrap = new WordWrap.Builder().from(inputStream, false).build();
        assertNotNull(wordWrap);
    }

}