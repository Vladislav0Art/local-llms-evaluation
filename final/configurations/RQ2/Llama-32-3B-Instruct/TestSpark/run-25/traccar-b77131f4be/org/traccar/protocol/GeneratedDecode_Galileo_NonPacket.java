package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.NetworkMessage;
import org.traccar.Position;
import org.traccar.Protocol;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.UnitsConverter;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_Galileo_NonPacket {

    @Mock
    private Channel channel;

    @Mock
    private DeviceSession deviceSession;

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(Protocol.GALILEO);

    @Test
    public void decode_Galileo_NonPacket() throws Exception {
        Object msg = Unpooled.buffer();
        Object result = decoder.decode(channel, null, msg);
        assertNull(result);
    }

}