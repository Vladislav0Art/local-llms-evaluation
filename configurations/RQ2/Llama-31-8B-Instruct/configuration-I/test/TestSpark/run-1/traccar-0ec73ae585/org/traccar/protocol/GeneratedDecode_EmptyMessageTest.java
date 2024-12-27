package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.protocol.Protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_EmptyMessageTest {

    @Mock
    private Protocol protocol;

    @InjectMocks
    private WatchProtocolDecoder decoder;

    @Test
    public void decode_EmptyMessageTest() throws Exception {
        when(protocol.getName()).thenReturn("test");
        when(protocol.decode(any(), any(), any())).thenReturn(new Object());
        Object result = decoder.decode(null, null, new Object());
        assertNotNull(result);
    }

}