package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.session.DeviceSession;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_decodeEmpty {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Parser parser;

    @Mock
    private PatternBuilder patternBuilder;

    @Mock
    private UnitsConverter unitsConverter;

    @Mock
    private Position position;

    @Mock
    private Network network;

    @Mock
    private CellTower cellTower;

    @Test
    public void decode_decodeEmpty() throws Exception {
        when(deviceSession.getId()).thenReturn(1L);
        ByteBuf buffer = Unpooled.buffer();

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(mock(Protocol.class));
        Object result = decoder.decode(mock(Channel.class), mock(SocketAddress.class), null);
        assertTrue(result == null);
    }

}