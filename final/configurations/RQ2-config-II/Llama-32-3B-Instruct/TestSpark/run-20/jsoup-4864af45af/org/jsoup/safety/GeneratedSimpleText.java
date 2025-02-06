package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedSimpleText {

    @Test
    public void simpleText() {
        String text = "Hello World";
        Safelist result = Safelist.simpleText().addTags("script", "img");
        assertTrue(Arrays.asList("script", "img").containsAll(result.addTags("script", "img")));
    }

}