package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.BitUtil;
import org.traccar.helper.Parser;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;

import java.util.Date;

@RunWith(JUnit4.class)
public class GeneratedDecode GetManufacturer_ReturnsNotNull {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Network network;

    @Mock
    private Position position;

    @Mock
    private CellTower cellTower;

    @Test
    public void decode

    GetManufacturer_ReturnsNotNull() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        String manufacturer = decoder.getManufacturer();
        assertNotNull(manufacturer);
    }

}