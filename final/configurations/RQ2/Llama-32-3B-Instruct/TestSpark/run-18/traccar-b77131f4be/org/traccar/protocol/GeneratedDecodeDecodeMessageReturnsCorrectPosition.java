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
public class GeneratedDecodeDecodeMessageReturnsCorrectPosition {

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
    public void decodeDecodeMessageReturnsCorrectPosition() throws Exception {
        NetworkMessage networkMessage = new TestNetworkMessage(GalileoLocation.create(31.23, -121.45));
        ByteBuf message = Unpooled.copiedBuffer(networkMessage.getBytes());
        Position position = (Position) decoder.decode(channel, channel.remoteAddress(), message);
        assertNotNull(position);
        assertEquals(31.23, position.getLatitude(), 0.01);
        assertEquals(-121.45, position.getLongitude(), 0.01);
    }

}