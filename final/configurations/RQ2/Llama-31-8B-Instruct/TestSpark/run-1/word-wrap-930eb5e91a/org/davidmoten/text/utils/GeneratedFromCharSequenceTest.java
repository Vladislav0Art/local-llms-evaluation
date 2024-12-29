package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFromCharSequenceTest {

    @Test
    public void fromCharSequenceTest() {
        String text = "Hello World!";
        WordWrap.Builder builder = WordWrap.from(text);
        assertNotNull(builder);
    }

}