package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndex_ReturnsFalse {

    @Mock
    private DeviceSession deviceSession;

    @Test
    public void getHasIndex_ReturnsFalse() {
        assertTrue(!WatchProtocolDecoder.getHasIndex());
    }

}