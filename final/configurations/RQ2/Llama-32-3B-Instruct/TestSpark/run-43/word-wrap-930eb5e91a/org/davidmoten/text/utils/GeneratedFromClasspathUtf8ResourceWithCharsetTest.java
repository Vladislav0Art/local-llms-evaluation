package org.davidmoten.text.utils;

public class GeneratedFromClasspathUtf8ResourceWithCharsetTest {

    @Test
    public void fromClasspathUtf8ResourceWithCharsetTest() {
        String resource = "test.resource";
        assertTrue(WordWrap.fromClasspathUtf8(resource, StandardCharsets.UTF_8).isPresent());
    }

}