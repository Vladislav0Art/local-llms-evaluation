package org.traccar.protocol;

import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.junit.Assert;
import org.junit.Test;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

    @Test
    public void getHasIndexTest() {
        Assert.assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        Assert.assertEquals(decoder.getManufacturer(), "watch");
    }

    @Test
    public void decodeValidMessageTest() throws Exception {
        SocketAddress sa = new InetSocketAddress("localhost", 8080);
        Channel mockChannel = Mockito.mock(Channel.class);
        Object msg = Unpooled.copiedBuffer("*HQ,1234567890,V1,093958,430916,12225.10142,N,08552.40284,E,0.00,0,00000000,60#".getBytes(StandardCharsets.UTF_8));
        Position position = (Position) decoder.decode(mockChannel, sa, msg);
        Position expectedPosition = new Position("watch");
        expectedPosition.setSpeed(0.0);
        expectedPosition.setLongitude(85.87338166666667);
        expectedPosition.setAltitude(0.0);
        expectedPosition.setNetwork(new Network());
        expectedPosition.setCourse(0.0);
        expectedPosition.setOutdated(false);
        expectedPosition.setProtocol("watch");
        expectedPosition.setValid(true);
        expectedPosition.setDeviceId(1L);
        expectedPosition.setServerTime(new Date());
        Assert.assertEquals(position, expectedPosition);
    }

    @Test
    public void decodeInvalidMessageTest() throws Exception {
        SocketAddress sa = new InetSocketAddress("localhost", 8080);
        Channel mockChannel = Mockito.mock(Channel.class);
        Object msg = Unpooled.copiedBuffer("*HQ,1234567890,V1,Goeg,430916,Invalid,N,08552.40284,E,0.00,0,00000000,60#".getBytes(StandardCharsets.UTF_8));
        Assert.assertNull(decoder.decode(mockChannel, sa, msg));
    }

}