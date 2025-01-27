package org.davidmoten.text.utils;

public class GeneratedFromReader_builderCreated {

    @Test
    public void fromReader_builderCreated() {
        String input = "Hello World";
        WordWrap.Builder builder = WordWrap.from(new StringReader(input));
        assertNotNull(builder);
    }

}