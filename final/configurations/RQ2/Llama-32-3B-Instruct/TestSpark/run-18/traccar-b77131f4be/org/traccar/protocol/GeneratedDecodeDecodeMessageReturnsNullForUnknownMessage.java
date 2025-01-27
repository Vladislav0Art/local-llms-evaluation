package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.NetworkMessage;
import org.traccar.Position;
import org.traccar.Protocol;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.DevicePosition;
import org.traccar.model.GalileoLocation;
import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.test.TestBase;
import org.traccar.test.TestDeviceSession;
import org.traccar.test.TestNetworkMessage;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeDecodeMessageReturnsNullForUnknownMessage {

    @Mock
    private DeviceSession deviceSession;

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(Protocol.GALILEO);

    @Override
    public void setup() throws Exception {
        super.setup();
        deviceSession.setDevice(new TestDevice());
        channel = socketChannel("localhost", 9876);
        addProtocol(decoder);
    }

    private Channel channel;

    @Test
    public void decodeDecodeMessageReturnsNullForUnknownMessage() throws Exception {
        NetworkMessage networkMessage = new TestNetworkMessage(unknownLocation());
        ByteBuf message = Unpooled.copiedBuffer(networkMessage.getBytes());
        Object decodedObject = decoder.decode(channel, channel.remoteAddress(), message);
        assertNull(decodedObject);
    }

}