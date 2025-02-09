package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.Unpooled;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsTestWhenHasLengthAndTimezone {

    @Test
    public void decodeGpsTestWhenHasLengthAndTimezone() {
        Position position = new Position();
        Protocol protocol = new Protocol("testProtocol");
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        assertTrue(decoder.decodeGps(position, Unpooled.buffer(), true, TimeZone.getDefault()));
    }

}