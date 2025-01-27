package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.regex.Pattern;

import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;

public class GeneratedGetManufacturer_WatchPositionMessage Test {

    @Test
    public void getManufacturer_WatchPositionMessage

    Test() {
        WatchProtocolDealer decoder = new WatchProtocolDealer(Protocol.WATCH Position Protocol);
        assertEquals("Traccar", decoder.getManufacturer());
    }

}