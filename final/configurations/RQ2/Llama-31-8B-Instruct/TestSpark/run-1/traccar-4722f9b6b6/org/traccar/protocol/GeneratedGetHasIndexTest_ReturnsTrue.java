package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.model.Position;
import org.traccar.model.Network;
import org.traccar.model.CellTower;
import org.traccar.model.WifiAccessPoint;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndexTest_ReturnsTrue {

    @InjectMocks
    private WatchProtocolDecoder decoder;

    @Test
    public void getHasIndexTest_ReturnsTrue() {
        assertTrue(decoder.getHasIndex());
    }

}