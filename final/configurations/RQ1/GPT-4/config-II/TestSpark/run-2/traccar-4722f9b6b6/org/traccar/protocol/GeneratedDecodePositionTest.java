package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneratedDecodePositionTest {

    @Test
    public void decodePositionTest() {
        WatchProtocolDecoder wDecoder = new WatchProtocolDecoder(new Protocol("watch"));
        DeviceSession ds = Mockito.mock(DeviceSession.class);
        Mockito.when(ds.getDeviceId()).thenReturn(1L);
        Position p = wDecoder.decodePosition(ds, "120822,014801,A,-27.477061,S,-48.52549,W,0.00,0.00,521.4,7,91,94,0,F,170180074632544,9,3410,30333,1,-0,647,13147,183,1,00:23:33:35:46:AC,255");
        Assert.assertNotNull(p);
        Assert.assertEquals(-48.52549, p.getLongitude(), 0);
        Assert.assertEquals(-27.477061, p.getLatitude(), 0);
        Assert.assertEquals(1L, p.getDeviceId(), 0);
    }
}

}