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
public class GeneratedDecodeChannelChannel_SoftwareId_withData_returnMap {

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
    public void decodeChannelChannel_SoftwareId_withData_returnMap() {
        when(baseProtocolDecoderMock.getSoftwareId()).thenReturn(0x11);
        Map<String, Object> data = new HashMap<>();
        // setup data here
        when(baseProtocolDecoderMock.getData()).thenReturn(data);
        Map<String, Object> result = (Map<String, Object>) galileoProtocolDecoder.decode(null, null, null);
        assertEquals(data, result);
    }

}