package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestDecode_Galileo_ByteBuf {

    public static final String MSG = "Hello, world!";
    public static final Protocol PROTOCOL = new Protocol();

    @Test
    public void testDecode_Galileo_ByteBuf() throws Exception {
        BaseProtocolDecoder decoder = new GalileoProtocolDecoder(PROTOCOL);
        ByteBuf byteBuf = Unpooled.buffer();
        byteBuf.writeShort(1234); // 1 byte, assuming 2 bytes per short
        byteBuf.writeLong(98765L); // 4 bytes, assuming 8 bits per long
        Object decoded = decoder.decode("192.168.1.100:1234", SocketAddress.IPV6, byteBuf);
        assertNotNull(decoded);
    }

}