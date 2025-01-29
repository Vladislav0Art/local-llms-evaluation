package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.nio.charset.StandardCharsets;
import java.time.Calendar;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecode_Galileo_Signal {

    @InjectMocks
    private GalileoProtocolDecoder galileoProtocolDecoder;

    @Mock
    private Protocol protocol;

    @Test
    public void testDecode_Galileo_Signal() throws Exception {
        // Given
        String signal = "1111111";
        ByteBuf bytes = Unpooled.buffer(32).encode(signal);
        when(protocol.getSignal()).thenReturn(new BitsConverter().convert(signal));

        // When
        Object result = galileoProtocolDecoder.decode(
                Channel.any(),
                SocketAddress.zero(),
                new NetworkMessage()
                        .withPayload(bytes)
                        .toBytes());

        // Then
        doReturn(result).when(protocol).getSignal();

        assertEquals("1111111", bytes.toString(StandardCharsets.UTF_8));
    }

}