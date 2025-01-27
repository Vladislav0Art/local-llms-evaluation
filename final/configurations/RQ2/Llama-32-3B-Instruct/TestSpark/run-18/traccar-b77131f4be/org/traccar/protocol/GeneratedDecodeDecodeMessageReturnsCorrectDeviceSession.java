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
public class GeneratedDecodeDecodeMessageReturnsCorrectDeviceSession {

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
    public void decodeDecodeMessageReturnsCorrectDeviceSession() throws Exception {
        deviceSession.setDevice(new TestDevice());
        NetworkMessage networkMessage = new TestNetworkMessage(GalileoLocation.create(31.23, -121.45));
        ByteBuf message = Unpooled.copiedBuffer(networkMessage.getBytes());
        DeviceSession decodedObject = (DeviceSession) decoder.decode(channel, channel.remoteAddress(), message);
        assertNotNull(decodedObject);
        assertEquals(deviceSession, decodedObject);
    }

    private GalileoLocation unknownLocation() {
        return null;
    }
}

class TestNetworkMessage extends NetworkMessage {
    public static final int TYPE_GALILEO_LOCATION = 1;

    private GalileoLocation location;

    public TestNetworkMessage(GalileoLocation location) {
        this.location = location;
    }

    @Override
    public int getType() {
        return TYPE_GALILEO_LOCATION;
    }

    @Override
    public Object getPayload() {
        return null; // not needed for test
    }
}

class TestDevice extends Device {
    private GalileoLocation location;

    public TestDevice(GalileoLocation location) {
        this.location = location;
    }

    @Override
    public GalileoLocation getLocation() {
        return location;
    }

}