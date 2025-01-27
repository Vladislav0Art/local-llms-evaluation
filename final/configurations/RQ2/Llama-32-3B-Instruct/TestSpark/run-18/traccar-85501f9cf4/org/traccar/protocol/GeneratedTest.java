package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

public class GeneratedTest {

    @Test
    public void decodeGps_GivenValidBuffer_ReturnsPosition() {
        ByteBuf buf = Unpooled.copiedBuffer(1, 2);
        Position position = new Position();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, null));
    }

    @Test
    public void decodeGps_GivenNullDate_ReturnsFalse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);
        assertTrue(!Gt06ProtocolDecoder.decodeGps(null, Unpooled.copiedBuffer(1, 2), true, null));
    }

    @Test
    public void decodeGps_GivenValidDate_ReturnsTrue() {
        Calendar calendar = Calendar.getInstance();
        Date date = DateBuilder.build(calendar);
        assertTrue(Gt06ProtocolDecoder.decodeGps(new Position(), Unpooled.copiedBuffer(1, 2), true, null));
    }

    @Test
    public void decodeGps_GivenInvalidDate_ReturnsFalse() {
        assertFalse(Gt06ProtocolDecoder.decodeGps(null, Unpooled.copiedBuffer(1, 2), true, null));
    }
}

@Test
public void decodeGps_GivenValidLength_ReturnsTrue() {
    ByteBuf buf = Unpooled.copiedBuffer(LENGTH, 2);
    assertTrue(Gt06ProtocolDecoder.decodeGps(null, buf, true, null));
}

@Test
public void decodeGps_GivenInvalidLength_ReturnsFalse() {
    ByteBuf buf = Unpooled.copiedBuffer(LENGTH + 1, 2);
    assertFalse(Gt06ProtocolDecoder.decodeGps(null, buf, true, null));
}
	}

@Test
public void decodeGps_GivenValidXml_ReturnsPosition() {
    ByteBuf buf = Unpooled.copiedBuffer(LENGTH, 2);
    Position position = new Position();
    assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, null));
}

@Test
public void decodeGps_GivenInvalidXml_ReturnsFalse() {
    assertFalse(Gt06ProtocolDecoder.decodeGps(null, Unpooled.copiedBuffer(LENGTH, 2), true, null));
}
	}

@Test
public void decodeGps_GivenValidChannel_ReturnsPosition() {
    Channel channel = new Channel();
    assertTrue(Gt06ProtocolDecoder.decode(null, channel, Unpooled.copiedBuffer(LENGTH, 2)));
}

@Test
public void decodeGps_GivenNullSession_ReturnsException() {
    DeviceSession session = null;
    try {
        Gt06ProtocolDecoder.decode(session, new Channel(), Unpooled.copiedBuffer(LENGTH, 2));
        fail("Expected exception");
    } catch (Exception e) {
        // expected
    }
}

@Test
public void decodeGps_GivenValidMessage_ReturnsPosition() {
    Object msg = null;
    assertTrue(Gt06ProtocolDecoder.decode(new Channel(), new SocketAddress(), msg));
}

}