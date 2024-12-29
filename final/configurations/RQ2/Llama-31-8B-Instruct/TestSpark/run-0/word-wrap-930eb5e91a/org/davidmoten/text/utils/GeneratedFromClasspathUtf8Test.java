package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFromClasspathUtf8Test {

    @Test
    public void fromClasspathUtf8Test() {
        String resource = "test.txt";
        org.davidmoten.text.utils.WordWrap.Builder builder = org.davidmoten.text.utils.WordWrap.fromClasspathUtf8(resource);
        assertNotNull(builder);
    }

}