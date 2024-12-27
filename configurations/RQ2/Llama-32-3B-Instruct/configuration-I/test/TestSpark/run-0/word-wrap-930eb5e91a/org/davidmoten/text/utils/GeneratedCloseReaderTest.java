package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCloseReaderTest {

    @Test
    public void closeReaderTest() {
        Reader reader = Mockito.mock(Reader.class);
        boolean close = true;
        WordWrap.close(reader, close);
        Mockito.verify(reader, Mockito.times(1)).close();
    }

}