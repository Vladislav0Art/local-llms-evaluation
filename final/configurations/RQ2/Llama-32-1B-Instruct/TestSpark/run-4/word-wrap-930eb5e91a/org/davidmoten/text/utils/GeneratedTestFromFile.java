package org.davidmoten.text.utils;

public class GeneratedTestFromFile {

    private WordWrap wordWrap;
    private Reader reader;

    @Test
    public void testFromFile() throws FileNotFoundException, IOException {
        Preconditions.checkArgument(wordWrap instanceof WordWrap.Builder);
        File file = new File("test.txt");
        wordWrap = new WordWrap.Builder().fromClasspath(file.getCanonicalPath(), StandardCharsets.UTF_8).build();
        assertNotNull(wordWrap);
    }

}