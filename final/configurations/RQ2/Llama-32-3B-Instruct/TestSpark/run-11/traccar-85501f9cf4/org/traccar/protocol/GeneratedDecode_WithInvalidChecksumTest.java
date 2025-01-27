package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.BcdUtil;
import org.traccar.helper.BitUtil;
import org.traccar.helper.Checksum;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_WithInvalidChecksumTest {

    @Mock
    private Channel channel;
    @Mock
    private SocketAddress remoteAddress;
    @Mock
    private Object msg;

    @Mock
    private Protocol protocol;

    public static void setupGt06ProtocolDecoderTest(Gt06ProtocolDecoder decoder) {
        decoder.setProtocol(protocol);
    }

    @Test
    public void decode_WithInvalidChecksumTest() throws Exception {
        ByteBuf buf = Unpooled.buffer();
        Position position = new Position("lat", "lon");
        Mockito.when(protocol.getName()).thenReturn("GT06");
        assertFalse(Gt06ProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}