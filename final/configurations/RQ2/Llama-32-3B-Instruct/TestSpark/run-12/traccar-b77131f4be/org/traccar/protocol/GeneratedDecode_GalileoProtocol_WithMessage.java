package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;

public class GeneratedDecode_GalileoProtocol_WithMessage {

    @Test
    public void decode_GalileoProtocol_WithMessage() {
        // given
        DeviceSession device = new DeviceSession("device");
        Protocol protocol = Protocol.GALILEO;
        Channel channel = new Channel();
        SocketAddress remoteAddress = Unpooled.buffer(10).writeBytes("127.0.0.1".getBytes()).address();
        NetworkMessage networkMessage = new NetworkMessage();

        // when
        Object result = new GalileoProtocolDecoder(protocol).decode(channel, remoteAddress, networkMessage);

        // then
        assertNotNull(result);
    }

}