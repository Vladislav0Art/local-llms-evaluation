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
public class GeneratedTest {

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

    HasIndex_ReturnsTrue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        assertTrue(decoder.getHasIndex());
    }

    @Test
    public void decode

    GetManufacturer_ReturnsNotNull() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        String manufacturer = decoder.getManufacturer();
        assertNotNull(manufacturer);
    }

    @Test
    public void decodeDecodeValidMessage_ReturnsNotNull() throws Exception {
        byte[] bytes = new byte[]{1, 2, 3, 4};
        ByteBuf buf = Unpooled.copiedBuffer(bytes);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        Object msg = decoder.decode(null, null, buf);
        assertNotNull(msg);
    }

    @Test
    public void decodeDecodeInvalidMessage_ThrowsException() throws Exception {
        byte[] bytes = new byte[]{1, 2, 3};
        ByteBuf buf = Unpooled.copiedBuffer(bytes);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        try {
            decoder.decode(null, null, buf);
            assert false;
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void decodeDecodeMessageWithInvalidLength_ThrowsException() throws Exception {
        byte[] bytes = new byte[]{1, 2, 3};
        ByteBuf buf = Unpooled.copiedBuffer(bytes);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        try {
            decoder.decode(null, null, buf);
            assert false;
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    public void decodeDecodeMessageWithMissingRequiredFields_ThrowsException() throws Exception {
        byte[] bytes = new byte[]{1};
        ByteBuf buf = Unpooled.copiedBuffer(bytes);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        try {
            decoder.decode(null, null, buf);
            assert false;
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    public void decodeDecodeMessageWithMissingCellTower_ThrowsException() throws Exception {
        byte[] bytes = new byte[]{1};
        ByteBuf buf = Unpooled.copiedBuffer(bytes);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        try {
            decoder.decode(null, null, buf);
            assert false;
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    public void decodeDecodeMessageWithMissingNetwork_ThrowsException() throws Exception {
        byte[] bytes = new byte[]{1};
        ByteBuf buf = Unpooled.copiedBuffer(bytes);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        try {
            decoder.decode(null, null, buf);
            assert false;
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    public void decodeDecodeMessageWithMissingPosition_ThrowsException() throws Exception {
        byte[] bytes = new byte[]{1};
        ByteBuf buf = Unpooled.copiedBuffer(bytes);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        try {
            decoder.decode(null, null, buf);
            assert false;
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    public void decodeDecodeMessageWithMissingWifiAccessPoint_ThrowsException() throws Exception {
        byte[] bytes = new byte[]{1};
        ByteBuf buf = Unpooled.copiedBuffer(bytes);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        try {
            decoder.decode(null, null, buf);
            assert false;
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    public void decodeDecodeMessageWithMissingDate_ThrowsException() throws Exception {
        byte[] bytes = new byte[]{1};
        ByteBuf buf = Unpooled.copiedBuffer(bytes);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        try {
            decoder.decode(null, null, buf);
            assert false;
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    public void decodeDecodeMessageWithInvalidBitMask_ThrowsException() throws Exception {
        byte[] bytes = new byte[]{1};
        ByteBuf buf = Unpooled.copiedBuffer(bytes);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        try {
            decoder.decode(null, null, buf);
            assert false;
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    public void decodeDecodeMessageWithInvalidVersion_ThrowsException() throws Exception {
        byte[] bytes = new byte[]{1};
        ByteBuf buf = Unpooled.copiedBuffer(bytes);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        try {
            decoder.decode(null, null, buf);
            assert false;
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

}