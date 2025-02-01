package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.helper.Parser;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.verify;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private SocketAddress socketAddress;

    @Test
    public void decodeInitTest() {
        Protocol protocol = new Protocol();
        String data = "[3G*4700990105*000E*INIT,1]";
        ByteBuf buf = Unpooled.copiedBuffer(data, StandardCharsets.US_ASCII);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object result = decoder.decode(null, socketAddress, buf);
        assertNull(result);
    }

    @Test
    public void decodeLkTest() {
        Protocol protocol = new Protocol();
        String data = "[3G*4700990105*0030*LK,0,100,0,100]";
        ByteBuf buf = Unpooled.copiedBuffer(data, StandardCharsets.US_ASCII);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Position result = (Position) decoder.decode(null, socketAddress, buf);
        assertEquals(100, result.getAttributes().get(Position.KEY_BATTERY_LEVEL));
    }

    @Test
    public void decodeAlValidAlarmTest() {
        Protocol protocol = new Protocol();
        String data = "[3G*4700990105*0164*AL,191122122959,A,4855.15090,N,01344.04520,E,0.00,0.00,300.00,10,100,50,100,0,2048]";
        ByteBuf buf = Unpooled.copiedBuffer(data, StandardCharsets.US_ASCII);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Position result = (Position) decoder.decode(null, socketAddress, buf);
        assertEquals(Position.ALARM_GEOFENCE_EXIT, result.getAttributes().get(Position.KEY_ALARM));
    }

    @Test
    public void decodePositionTest() {
        Protocol protocol = new Protocol();
        String data = "[3G*4700990105*0164*UD,191122122959,A,4855.15090,N,01344.04520,E,0.00,0.00,300.00,10,100,50,100,0,2048]";
        ByteBuf buf = Unpooled.copiedBuffer(data, StandardCharsets.US_ASCII);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Position result = (Position) decoder.decode(null, socketAddress, buf);

        assertEquals(4855.15090, result.getLatitude(), 0.00001);
        assertEquals(01344.04520, result.getLongitude(), 0.00001);
        assertEquals(0.00, UnitsConverter.knotsFromKph(result.getSpeed()), 0.01);
        assertEquals(300.0, result.getAltitude(), 0.01);
        assertEquals(50, result.getAttributes().get(Position.KEY_RSSI));
    }

    @Test
    public void getHasIndexTest() {
        Protocol protocol = new Protocol();
        String data = "[3G*4700990105*0030*LK,0,100,0,100]";
        ByteBuf buf = Unpooled.copiedBuffer(data, StandardCharsets.US_ASCII);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.decode(null, socketAddress, buf);
        assertTrue(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        Protocol protocol = new Protocol();
        String data = "[3G*4700990105*0030*LK,0,100,0,100]";
        ByteBuf buf = Unpooled.copiedBuffer(data, StandardCharsets.US_ASCII);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.decode(null, socketAddress, buf);
        assertEquals("3G", decoder.getManufacturer());
    }

}