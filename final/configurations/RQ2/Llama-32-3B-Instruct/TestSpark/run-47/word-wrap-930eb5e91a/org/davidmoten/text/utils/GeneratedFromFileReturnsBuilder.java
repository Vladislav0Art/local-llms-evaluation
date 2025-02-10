package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedFromFileReturnsBuilder {

    @Test
    public void fromFileReturnsBuilder() {
        File file = new File("file");
        Charset charset = StandardCharsets.UTF_8;
        assertEquals(WordWrap.Builder.class, WordWrap.from(file, charset).getClass());
    }

}