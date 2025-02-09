package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import org.traccar.Protocol;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.nio.charset.StandardCharsets;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class GeneratedGetManufacturerTest {

    WatchProtocolDecoder .class,ByteBuf .class,Channel .class,Protocol .class
})

public class WatchProtocolDecoderTest {

    @Mock
    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void getManufacturerTest() {
        when(watchProtocolDecoder.getManufacturer()).thenReturn("TestManufacturer");
        assertEquals("TestManufacturer", watchProtocolDecoder.getManufacturer());
    }

}