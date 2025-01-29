package org.davidmoten.text.utils;

public class GeneratedTestFromClasspath {

    private WordWrap wordWrap;
    private Reader reader;

    @Test
    public void testFromClasspath() throws FileNotFoundException, IOException {
        Preconditions.checkArgument(wordWrap instanceof WordWrap.Builder);
        String resource = "test.txt";
        wordWrap = new WordWrap.Builder().fromClasspath(resource).build();
        assertNotNull(wordWrap);
    }

}