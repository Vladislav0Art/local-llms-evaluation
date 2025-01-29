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
public class GeneratedTest {

    @InjectMocks
    private GalileoProtocolDecoder galileoProtocolDecoder;

    @Mock
    private Protocol protocol;

    @Test
    public void testDecode_Galileo_Power() throws Exception {
        // Given
        String power = "0x0123456789abcdef";
        ByteBuf bytes = Unpooled.buffer(32).encode(power);
        when(protocol.getPower()).thenReturn(new BitsConverter().convert(power));

        // When
        Object result = galileoProtocolDecoder.decode(
                Channel.any(),
                SocketAddress.zero(),
                new NetworkMessage()
                        .withPayload(bytes)
                        .toBytes());

        // Then
        doReturn(result).when(protocol).getPower();

        assertEquals("0x0123456789abcdef", bytes.toString(StandardCharsets.UTF_8));
    }

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

    @Test
    public void testDecode_Galileo_MacAddress() throws Exception {
        // Given
        String mac = "00:11:22:33:44:55";
        ByteBuf bytes = Unpooled.buffer(16).encode(mac);
        when(protocol.getMac()).thenReturn(new BitsConverter().convert(mac));

        // When
        Object result = galileoProtocolDecoder.decode(
                Channel.any(),
                SocketAddress.zero(),
                new NetworkMessage()
                        .withPayload(bytes)
                        .toBytes());

        // Then
        doReturn(result).when(protocol).getMac();

        assertEquals("00:11:22:33:44:55", bytes.toString(StandardCharsets.UTF_8));
    }

    @Test
    public void testDecode_Galileo_Neighbor() throws Exception {
        // Given
        String neighbor = "10.0.0.1";
        ByteBuf bytes = Unpooled.buffer(20).encode(neighbor);
        when(protocol.getNeighbor()).thenReturn(new BitsConverter().convert(neighbor));

        // When
        Object result = galileoProtocolDecoder.decode(
                Channel.any(),
                SocketAddress.zero(),
                new NetworkMessage()
                        .withPayload(bytes)
                        .toBytes());

        // Then
        doReturn(result).when(protocol).getNeighbor();

        assertEquals("10.0.0.1", bytes.toString(StandardCharsets.UTF_8));
    }

    @Test
    public void testDecode_Galileo_DeltaT() throws Exception {
        // Given
        double dt = 60;
        Object result = galileoProtocolDecoder.decode(
                Channel.any(),
                SocketAddress.zero(),
                new NetworkMessage()
                        .withPayload(new Date(dt).toInstant(ZoneId.systemDefault()))
                        .toBytes());

        // Then
        assertEquals(dt, (double) result);

        doReturn(result).when(protocol).getDeltaT();

        try {
            galileoProtocolDecoder.decode(
                    Channel.any(),
                    SocketAddress.zero(),
                    new NetworkMessage()
                            .withPayload(new Date(Instant.now().toEpochMilli(ZoneId.systemDefault())))
                            .toBytes());
        } catch (Exception e) {
            fail("Expected Exception, but no exception was thrown");
        }
    }

    @Test
    public void testDecode_Galileo_Persona() throws Exception {
        // Given
        String persona = "1234567890";
        ByteBuf bytes = Unpooled.buffer(16).encode(persona);
        when(protocol.getPersona()).thenReturn(new BitsConverter().convert(persona));

        // When
        Object result = galileoProtocolDecoder.decode(
                Channel.any(),
                SocketAddress.zero(),
                new NetworkMessage()
                        .withPayload(bytes)
                        .toBytes());

        // Then
        doReturn(result).when(protocol).getPersona();

        assertEquals("1234567890", bytes.toString(StandardCharsets.UTF_8));
    }

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