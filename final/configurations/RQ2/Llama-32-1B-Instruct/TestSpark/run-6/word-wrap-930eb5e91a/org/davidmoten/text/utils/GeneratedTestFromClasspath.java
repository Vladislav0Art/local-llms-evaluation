package org.davidmoten.text.utils;

public class GeneratedTestFromClasspath {

    @Test
    public void testFromClasspath() {
        String resource = "example.txt";
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder.from(resource, charset).wordWrap(null, null, 10, null, null, null, false, true);
    }

}