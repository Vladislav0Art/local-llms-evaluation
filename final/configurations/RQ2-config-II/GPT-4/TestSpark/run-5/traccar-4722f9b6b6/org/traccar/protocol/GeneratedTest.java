package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;

public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Position position = new Position();
        position.setLongitude(50.45);
        position.setLatitude(30.52);
        position.setSpeed(UnitsConverter.knotsFromKph(60.0));
        position.setCourse(45.0);
        position.set(Position.KEY_BATTERY, 50);

        try {
            Position result = (Position) decoder.decode(channel, remoteAddress, "[SG*8800000015*0004*LK]");
            Assert.assertEquals(position, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        boolean hasIndex = decoder.getHasIndex();
        Assert.assertTrue(hasIndex);
    }

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String manufacturer = decoder.getManufacturer();
        Assert.assertEquals("Traccar", manufacturer);
    }

    @Test
    public void decodeWithWrongInputTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        try {
            Position result = (Position) decoder.decode(channel, remoteAddress, "[SG*8800000015*0004*LK][WRONG_INPUT]");
            Assert.assertNull(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void decodeWithNullInputTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        try {
            Position result = (Position) decoder.decode(channel, remoteAddress, null);
            Assert.assertNull(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}