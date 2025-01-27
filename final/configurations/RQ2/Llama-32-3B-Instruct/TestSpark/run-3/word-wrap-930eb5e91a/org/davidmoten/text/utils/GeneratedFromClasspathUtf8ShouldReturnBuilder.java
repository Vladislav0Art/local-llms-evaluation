package org.davidmoten.text.utils;

public class GeneratedFromClasspathUtf8ShouldReturnBuilder {

    @Test
    public void fromClasspathUtf8ShouldReturnBuilder() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("Hello World");
        assertNotNull(builder);
    }

}