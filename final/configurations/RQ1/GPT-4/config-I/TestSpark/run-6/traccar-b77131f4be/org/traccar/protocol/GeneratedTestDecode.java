package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.ProtocolDecoder;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.NetworkMessage;
import org.traccar.helper.Log;
import org.traccar.model.Device;
import org.traccar.model.DeviceSession;
import org.traccar.CommonProtocolDecoderTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;

public class GeneratedTestDecode {

    public GalileoProtocolDecoderTest() {
        super(new GalileoProtocol());
    }

    @Test
    public void testDecode() throws Exception {
        Channel channel = Mockito.mock(Channel.class);

        Mockito.when(channel.writeAndFlush(Mockito.any())).thenReturn(null);

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        verifyAttributes(decoder, channel, null,
                "\2<\0F123456789012345\n\0\3ID1",
                position("2014-07-25 06:08:08.000", true, 53.27835, -2.19556));
        verifyAttributes(decoder, channel, null,
                "\2n\0F123456789012345\0\0\16\13\0\10\4\1abc",
                position("2014-07-27 12:47:08.000", true, 53.27835, -2.1955));
    }

}