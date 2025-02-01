package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.*;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        WatchProtocolDecoder decoder = spy(new WatchProtocolDecoder(new Protocol("watch")));
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        String hexString = "5B38322A313233342A363331372A6266742C32302C2C32302C2C312C302C303132332530303435472C3131392C302C323031363131303830393031322C69646C652C3030304523414343304330423634304230323023474330322C31382C3139313039313332303242090021470934";
        ByteBuf buf = Unpooled.wrappedBuffer(org.apache.commons.codec.binary.Hex.decodeHex(hexString.toCharArray()));
        Object decodedObject = decoder.decode(channel, remoteAddress, buf);

        verify(decoder, times(3)).sendResponse(any(), any(), any(), any());
    }

}