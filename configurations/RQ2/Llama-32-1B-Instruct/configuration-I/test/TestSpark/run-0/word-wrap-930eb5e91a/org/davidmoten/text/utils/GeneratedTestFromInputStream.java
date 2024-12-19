package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mock;

public class GeneratedTestFromInputStream {

    @Test
    public void testFromInputStream() {
        final InputStream in = Mockito.mock(InputStream.class);
        final String charset = "UTF-8";
        WordWrap.from(in, charset).wordWrap(0, System.out, null, null, null, null, false, false);
        Mockito.verify(in).read();
    }

}