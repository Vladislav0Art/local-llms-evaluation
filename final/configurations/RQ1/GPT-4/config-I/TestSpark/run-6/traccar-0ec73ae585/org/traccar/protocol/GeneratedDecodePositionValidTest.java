package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.socket.DatagramChannel;
import junit.framework.TestCase;
import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.session.DeviceSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.DatatypeConverter;
import java.net.SocketAddress;
import java.util.Date;

public class GeneratedDecodePositionValidTest {

    private static final Logger logger = LoggerFactory.getLogger(WatchProtocolDecoderTest.class);
    private static final String PROTOCOL_NAME = "watch";
    private WatchProtocolDecoder decoder;

    @Override
    public void setUp() {
        decoder = new WatchProtocolDecoder(null);
    }

    private DeviceSession createDeviceSession() {
        return new DeviceSession("manufacturingId123", "deviceId123", new Date());
    }

    private ByteBuf createByteBuf(String msg) {
        return Unpooled.wrappedBuffer(DatatypeConverter.parseHexBinary(msg));
    }

    @Test
    public void decodePositionValidTest() {
        String messageType = "1C840D0A00010D0200000001000000000000";
        ByteBuf buf = createByteBuf(messageType);
        DeviceSession deviceSession = createDeviceSession();
        Position result = decoder.decodePosition(deviceSession, buf.toString(Charset.defaultCharset()));
        assertNotNull(result);
        assertEquals(deviceSession.getDeviceId(), result.getDeviceId());
        logger.info("Result of decode position from bytes.");
    }

}