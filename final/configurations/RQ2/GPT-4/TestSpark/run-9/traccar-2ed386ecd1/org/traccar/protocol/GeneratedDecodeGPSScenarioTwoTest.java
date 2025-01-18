package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.traccar.Protocol;
import org.traccar.model.Position;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGPSScenarioTwoTest {


    @Mock
    private Protocol mockProtocol;

    @Mock
    private Channel mockChannel;

    @Mock
    private SocketAddress mockRemoteAddress;

    // Testing the constructor

    @Test
    public void decodeGPSScenarioTwoTest() {
        Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(mockProtocol);
        Position position = new Position();
        ByteBuf mockByteBuf = Unpooled.copiedBuffer("testData", StandardCharsets.UTF_8);
        TimeZone timeZone = TimeZone.getDefault();
        assertNotNull(gt06ProtocolDecoder.decodeGps(position, mockByteBuf, true, true, true, timeZone));
    }

}