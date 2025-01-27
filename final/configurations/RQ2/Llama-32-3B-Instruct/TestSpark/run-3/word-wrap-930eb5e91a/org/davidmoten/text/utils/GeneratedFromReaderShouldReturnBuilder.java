package org.davidmoten.text.utils;

public class GeneratedFromReaderShouldReturnBuilder {

    @Test
    public void fromReaderShouldReturnBuilder() {
        try (WordWrap.Builder builder = WordWrap.from(new String[]{"Hello", "World"})) {
            assertNotNull(builder);
        }
    }

}