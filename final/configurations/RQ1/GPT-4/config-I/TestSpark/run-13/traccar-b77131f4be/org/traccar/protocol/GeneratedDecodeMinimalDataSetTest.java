package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

import java.nio.charset.StandardCharsets;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeMinimalDataSetTest {

    private GalileoProtocolDecoder decoder = spy(new GalileoProtocolDecoder(null));

    @Test
    public void decodeMinimalDataSetTest() {
        ByteBuf buf = Unpooled.buffer();
        buf.writeInt(1);
        buf.writeInt(1);
        buf.writeInt(0);
        buf.writeInt(1);
        Position position = new Position();
        decoder.decodeMinimalDataSet(position, buf);
        assertNotNull(position.getLatitude());
        assertNotNull(position.getLongitude());
        assertNotNull(position.getTime());
    }

}