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
public class GeneratedTestDecode_Galileo_Network {

    @InjectMocks
    private GalileoProtocolDecoder galileoProtocolDecoder;

    @Mock
    private Protocol protocol;

    @Test
    public void testDecode_Galileo_Network() throws Exception {
        // Given
        byte[] network = new byte[]{1, 2, 3, 4};
        Object result = galileoProtocolDecoder.decode(
                Channel.any(),
                SocketAddress.zero(),
                new NetworkMessage()
                        .withPayload(network)
                        .toBytes());

        // Then
        assertEquals(4, (int) result);

        doReturn(result).when(protocol).getNetwork();

        try {
            galileoProtocolDecoder.decode(
                    Channel.any(),
                    SocketAddress.zero(),
                    new NetworkMessage()
                            .withPayload(new byte[]{5, 6, 7, 8})
                            .toBytes());
        } catch (Exception e) {
            fail("Expected Exception, but no exception was thrown");
        }
    }

}