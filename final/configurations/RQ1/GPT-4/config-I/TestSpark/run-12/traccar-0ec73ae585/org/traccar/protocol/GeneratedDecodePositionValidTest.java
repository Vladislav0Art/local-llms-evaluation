package org.traccar.protocol;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.helper.Parser;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodePositionValidTest {

    @Test
    public void decodePositionValidTest() throws Exception {
        String rawData = "010101,010101,A,51.516444,-0.139448,000.0,168,440,08,23,96,0008,1132,CELL,1,0,234,20,8729,10400742,+29,WF,1,MyWifi,E8:9F:13:31:DE:12,-53";
        DeviceSession deviceSession = mock(DeviceSession.class);
        when(deviceSession.getDeviceId()).thenReturn(1234L);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol(""));
        Position position = decoder.decodePosition(deviceSession, rawData);
        assertNotNull(position);
        assertTrue(position.getValid());
        assertEquals(51.516444, position.getLatitude(), 0.000001);
        assertEquals(-0.139448, position.getLongitude(), 0.000001);
    }

}