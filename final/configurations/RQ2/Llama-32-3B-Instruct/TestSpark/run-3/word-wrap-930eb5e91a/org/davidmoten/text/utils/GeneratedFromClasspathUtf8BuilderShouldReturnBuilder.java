package org.davidmoten.text.utils;

public class GeneratedFromClasspathUtf8BuilderShouldReturnBuilder {

    @Test
    public void fromClasspathUtf8BuilderShouldReturnBuilder() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("Hello World");
        assertNotNull(builder);
    }

}