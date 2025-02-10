package org.davidmoten.text.utils;

public class GeneratedFromReader_EmptyText_BuilderShouldReturnBuilder {

    @Test
    public void fromReader_EmptyText_BuilderShouldReturnBuilder() {
        Preconditions.checkNotNull(new WordWrap.Builder().from(new ArrayList<>()));
    }

}