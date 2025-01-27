package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeNullBufTest {

    @Mock
    private ByteBuf buf;

    @Mock
    private Channel channel;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private NetworkMessage networkMessage;

    @Test
    public void decodeNullBufTest() {
        byte[] bytes = { /* valid data */};
        int length = 10;
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getTimeZone("UTC");
        Position position = new Position(1, 2, 3);
        assertThrows(Exception.class, () -> Gt06ProtocolDecoder.decodeGps(position, null, length, timezone));
    }

}