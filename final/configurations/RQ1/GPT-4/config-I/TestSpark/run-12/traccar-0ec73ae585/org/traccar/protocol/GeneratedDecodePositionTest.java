package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.BaseProtocol;
import org.traccar.model.Position;

import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodePositionTest {

    @Mock
    DeviceSession deviceSession;

    @Test
    public void decodePositionTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new BaseProtocol(""));
        Method decodePositionMethod = WatchProtocolDecoder.class.getDeclaredMethod("decodePosition", DeviceSession.class, String.class);
        decodePositionMethod.setAccessible(true);
        when(deviceSession.getDeviceId()).thenReturn(1234L);
        Position position = (Position) decodePositionMethod.invoke(decoder, deviceSession, "");
        assertNull(position);
    }

}