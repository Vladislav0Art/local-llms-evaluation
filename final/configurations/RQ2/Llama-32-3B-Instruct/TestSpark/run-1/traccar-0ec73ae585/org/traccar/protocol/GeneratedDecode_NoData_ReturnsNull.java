package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.BitUtil;
import org.traccar.helper.BufferUtil;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;
import org.traccar.protocol.WatchProtocolDecoderImpl;
import org.traccar.session.DeviceSession;
import org.traccar.session.DeviceSessionManager;
import org.traccar.utils.DateParser;
import org.traccar.utils.Parser;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_NoData_ReturnsNull {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Network network;

    @Mock
    private CellTower cellTower;

    @Mock
    private Position position;

    @Mock
    private WifiAccessPoint wifiAccessPoint;

    private final WatchProtocolDecoderDecoder decoder = new WatchProtocolDecoderImpl();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    public void assertDecoderHasExpectedResult() {
        when(deviceSession.getManufacturer()).thenReturn("test");
        when(network.getProtocolVersion()).thenReturn(1);
        when(position.getLongitude()).thenReturn(-122.0);
        when(position.getLatitude()).thenReturn(37.0);
        when(wifiAccessPoint.getNetworkId()).thenReturn(123);
    }

    @Test
    public void decode_NoData_ReturnsNull() {
        ByteBuf buffer = Unpooled.buffer();
        NetworkMessage networkMessage = new NetworkMessage(buffer, deviceSession);
        Object result = decoder.decode(deviceSession.getChannel(), deviceSession.getRemoteAddress(), networkMessage);
        assert (result == null);
    }

}