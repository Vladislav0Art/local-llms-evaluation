package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.traccar.helper.BitUtil;
import org.traccar.helper.BufferUtil;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

public class GeneratedGetManufacturer_Watch {

    @BeforeClass
    public static void setup() {
        // Initialize mock objects
        Mockito.when(BitUtil.getBit(1)).thenReturn(true);
        Mockito.when(BufferUtil.getByteArray()).thenReturn(new byte[]{1, 2, 3});
    }

    @Test
    public void getManufacturer_Watch() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertEquals("Watch", decoder.getManufacturer());
    }

}