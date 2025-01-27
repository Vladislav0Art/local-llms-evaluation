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

public class GeneratedGetHasIndex_WatchWifiAccessPointMessage Test {

    @Test
    public void getHasIndex_WatchWifiAccessPointMessage

    Test() {
        WatchProtocolDealer decoder = new WatchProtocolDealer(Protocol.WATCH WifiAccessPoint Protocol);
        assertTrue(decoder.getHasIndex());
    }

}