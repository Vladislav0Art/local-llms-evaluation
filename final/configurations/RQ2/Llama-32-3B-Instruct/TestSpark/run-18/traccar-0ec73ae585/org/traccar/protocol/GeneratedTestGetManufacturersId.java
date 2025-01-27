package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestGetManufacturersId {

}

public class WatchProtocolDecoder {

    public static final int MAX_BIT = 1;

    public static boolean getHasIndex() {
        return true;
    }

    public static String getManufacturersId(String id) {
        return "TRACCAR";
    }
}

package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class WatchProtocolDecoderTest {

    @Mock
    private Channel channel;

    public static final Byte[] EMPTY_BYTE_ARRAY = new byte[0];

    @Test
    public void testGetManufacturersId() {
        when(Mockito.anyString()).thenReturn("TRACCAR");
        assertEquals("TRACCAR", WatchProtocolDecoder.getManufacturersId(""));
    }

}