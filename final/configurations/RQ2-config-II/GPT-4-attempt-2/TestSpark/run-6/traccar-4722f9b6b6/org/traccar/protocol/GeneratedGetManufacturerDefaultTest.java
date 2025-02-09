package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetManufacturerDefaultTest {

    @Mock
    private Protocol protocolMock;

    @Mock
    private Channel channelMock;

    @Mock
    private SocketAddress remoteAddressMock;

    @Test
    public void getManufacturerDefaultTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocolMock);
        assertNull(watchProtocolDecoder.getManufacturer());
    }

}