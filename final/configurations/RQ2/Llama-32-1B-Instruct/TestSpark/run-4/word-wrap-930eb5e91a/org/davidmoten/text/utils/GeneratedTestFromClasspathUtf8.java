package org.davidmoten.text.utils;

public class GeneratedTestFromClasspathUtf8 {

    private WordWrap wordWrap;
    private Reader reader;

    @Test
    public void testFromClasspathUtf8() throws FileNotFoundException, IOException {
        Preconditions.checkArgument(wordWrap instanceof WordWrap.Builder);
        String resource = "test.txt";
        wordWrap = new WordWrap.Builder().fromClasspathUtf8(resource).build();
        assertNotNull(wordWrap);
    }

}