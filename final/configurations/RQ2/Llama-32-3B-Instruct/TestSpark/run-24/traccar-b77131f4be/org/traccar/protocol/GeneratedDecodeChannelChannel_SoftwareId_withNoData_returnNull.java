package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedDecodeChannelChannel_SoftwareId_withNoData_returnNull {

    @Mock
    private BaseProtocolDecoder baseProtocolDecoderMock;

    @InjectMocks
    private GalileoProtocolDecoder galileoProtocolDecoder;

    @PrepareForTest({ByteBufUtil.class, UnitsConverter.class})
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void decodeChannelChannel_SoftwareId_withNoData_returnNull() {
        when(baseProtocolDecoderMock.getSoftwareId()).thenReturn(0x11);
        Object result = galileoProtocolDecoder.decode(null, null, null);
        assertNull(result);
    }

}