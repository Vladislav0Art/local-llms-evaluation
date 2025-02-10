package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedFromClasspathReturnsBuilder {

    @Test
    public void fromClasspathReturnsBuilder() {
        String resource = "resource";
        Charset charset = StandardCharsets.UTF_8;
        assertEquals(WordWrap.Builder.class, WordWrap.fromClasspath(resource, charset).getClass());
    }

}