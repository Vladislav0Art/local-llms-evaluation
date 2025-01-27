package org.davidmoten.text.utils;

public class GeneratedFromUtf8BuilderShouldReturnBuilder {

    @Test
    public void fromUtf8BuilderShouldReturnBuilder() {
        try (WordWrap.Builder builder = WordWrap.fromUtf8("Hello World")) {
            assertNotNull(builder);
        }
    }

}