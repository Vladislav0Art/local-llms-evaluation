package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mock;

public class GeneratedTestFromUtf8InputStream {

    @Test
    public void testFromUtf8InputStream() {
        final InputStream in = Mockito.mock(InputStream.class);
        final Writer out = new StringWriter();
        WordWrap.fromUtf8(in, "UTF-8").wordWrap(out, "\n", 100, null, null, null, false, false);
        assertEquals("Hello world\n", out.toString());
    }

}