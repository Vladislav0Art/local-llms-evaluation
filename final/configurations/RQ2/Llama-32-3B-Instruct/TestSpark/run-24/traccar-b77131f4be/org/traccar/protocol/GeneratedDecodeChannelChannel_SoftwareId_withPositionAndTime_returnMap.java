package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.bufferByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedDecodeChannelChannel_SoftwareId_withPositionAndTime_returnMap {

    ByteBufUtil .class,UnitsConverter .class
})

public class GalileoProtocolDecoderTest {

    @Mock
    private BaseProtocolDecoder baseProtocolDecoderMock;

    @InjectMocks
    private GalileoProtocolDecoder galileoProtocolDecoder;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void decodeChannelChannel_SoftwareId_withPositionAndTime_returnMap() {
        when(baseProtocolDecoderMock.getSoftwareId()).thenReturn(0x11);
        Calendar calendar = Calendar.getInstance();
        // setup time here
        when(baseProtocolDecoderMock.getTime()).thenReturn(calendar);
        Position position = new Position();
        // setup position here
        when(baseProtocolDecoderMock.getPosition()).thenReturn(position);
        Map<String, Object> result = (Map<String, Object>) galileoProtocolDecoder.decode(null, null, null);
        assertNotNull(result);
    }

}