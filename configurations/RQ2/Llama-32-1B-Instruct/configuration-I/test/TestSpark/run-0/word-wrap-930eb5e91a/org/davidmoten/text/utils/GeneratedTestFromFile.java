package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mock;

public class GeneratedTestFromFile {

    @Test
    public void testFromFile() {
        final File file = Mockito.mock(File.class);
        final String charset = "UTF-8";
        WordWrap.from(file, charset).wordWrap(0, System.out, null, null, null, null, false, false);
        Mockito.verify(file).read();
    }

}