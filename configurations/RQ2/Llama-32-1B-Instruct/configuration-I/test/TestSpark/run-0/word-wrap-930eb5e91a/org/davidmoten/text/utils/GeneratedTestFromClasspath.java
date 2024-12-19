package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mock;

public class GeneratedTestFromClasspath {

    @Test
    public void testFromClasspath() {
        final BufferedReader reader = Mockito.mock(BufferedReader.class);
        final String resource = "resource";
        WordWrap.fromClasspath(resource, Charset.forName("UTF-8")).wordWrap(reader, "\n", 100, null, null, null, false, false);
        Mockito.verify(reader).read();
    }

}