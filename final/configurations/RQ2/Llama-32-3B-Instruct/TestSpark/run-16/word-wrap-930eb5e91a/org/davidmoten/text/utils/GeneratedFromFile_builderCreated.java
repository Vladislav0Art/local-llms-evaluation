package org.davidmoten.text.utils;

public class GeneratedFromFile_builderCreated {

    @Test
    public void fromFile_builderCreated() throws IOException {
        String input = "test.txt";
        WordWrap.Builder builder = WordWrap.fromFile(input);
        assertNotNull(builder);
    }

}