package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndexTest {

    @Mock
    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void getHasIndexTest() {
        when(watchProtocolDecoder.getHasIndex()).thenReturn(true);
        assertEquals(true, watchProtocolDecoder.getHasIndex());
    }

}