package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mock;

public class GeneratedTestFromClasspathUtf8 {

    @Test
    public void testFromClasspathUtf8() {
        final BufferedReader reader = Mockito.mock(BufferedReader.class);
        final String resource = "resource";
        WordWrap.fromClasspathUtf8(resource).wordWrap(reader, "\n", 100, null, null, null, false, false);
        Mockito.verify(reader).read();
    }

}