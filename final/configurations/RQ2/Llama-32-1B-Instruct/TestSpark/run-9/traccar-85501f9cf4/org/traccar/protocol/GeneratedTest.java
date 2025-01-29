package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.traccar.protocol.Gt06ProtocolDecoder;

public class GeneratedTest {

    @Test
    public void testDecodePosition_Geolocation() {
        byte[] input = new byte[]{1, 2, 3, 4};
        Position position = Mockito.mock(Position.class);
        when(position.getLatitude()).thenReturn(5);
        when(position.getLongitude()).thenReturn(6);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, false, false, false, null);

        assertEquals(1, ((Position) result).getLatitude(), 0.001);
        assertEquals(2, ((Position) result).getLongitude(), 0.001);
    }

    @Test
    public void testDecodeGpsNoLatLong() {
        byte[] input = new byte[]{1};
        Position position = Mockito.mock(Position.class);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, true, false, false, null);

        assertNull(result);
    }

    @Test
    public void testDecodeGpsNoLatLongHasSatellites() {
        byte[] input = new byte[]{1, 2, 3};
        Position position = Mockito.mock(Position.class);
        when(position.getLatitude()).thenReturn(5);
        when(position.getLongitude()).thenReturn(6);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, true, false, true, null);

        assertNull(result);
    }

    @Test
    public void testDecodeGpsNoLatLongHasSpeed() {
        byte[] input = new byte[]{1};
        Position position = Mockito.mock(Position.class);
        when(position.getLatitude()).thenReturn(5);
        when(position.getLongitude()).thenReturn(6);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, false, true, true, null);

        assertNull(result);
    }

    @Test
    public void testDecodeGpsNoLatLongHasChecksum() {
        byte[] input = new byte[]{1, 2, 3};
        Position position = Mockito.mock(Position.class);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, false, true, true, new Checksum());

        assertNull(result);
    }

    @Test
    public void testDecodeGpsWithChecksum() {
        byte[] input = new byte[]{1, 2, 3};
        Position position = Mockito.mock(Position.class);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, false, true, true, new Checksum());

        assertEquals(true, (boolean) ((Checksum) result).getChecksum(), 0.001);
    }

    @Test
    public void testDecodeGpsWithChecksumHasSatellites() {
        byte[] input = new byte[]{1, 2, 3};
        Position position = Mockito.mock(Position.class);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, true, false, true, new Checksum());

        assertEquals(true, (boolean) ((Checksum) result).getChecksum(), 0.001);
    }

    @Test
    public void testDecodeGpsWithChecksumHasSpeed() {
        byte[] input = new byte[]{1};
        Position position = Mockito.mock(Position.class);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, false, true, true, new Checksum());

        assertEquals(true, (boolean) ((Checksum) result).getChecksum(), 0.001);
    }

    @Test
    public void testDecodeGpsWithChecksumHasLatitudeAndLongitude() {
        byte[] input = new byte[]{1, 2, 3};
        Position position = Mockito.mock(Position.class);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, false, true, true, new Checksum());

        assertEquals(5, ((Position) result).getLatitude(), 0.001);
        assertEquals(6, ((Position) result).getLongitude(), 0.001);
    }

    @Test
    public void testDecodeGpsWithChecksumHasSatellitesAndSpeed() {
        byte[] input = new byte[]{1, 2, 3};
        Position position = Mockito.mock(Position.class);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, true, false, true, new Checksum());

        assertEquals(5, ((Position) result).getLatitude(), 0.001);
        assertEquals(6, ((Position) result).getLongitude(), 0.001);
    }

    @Test
    public void testDecodeGpsWithChecksumHasLatLongAndChecksum() {
        byte[] input = new byte[]{1, 2, 3};
        Position position = Mockito.mock(Position.class);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, false, true, true, new Checksum());

        assertEquals(5, ((Position) result).getLatitude(), 0.001);
        assertEquals(6, ((Position) result).getLongitude(), 0.001);
    }

    @Test
    public void testDecodeGpsWithChecksumHasLatLongSatellitesAndSpeed() {
        byte[] input = new byte[]{1, 2, 3};
        Position position = Mockito.mock(Position.class);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, true, false, true, new Checksum());

        assertEquals(5, ((Position) result).getLatitude(), 0.001);
        assertEquals(6, ((Position) result).getLongitude(), 0.001);
    }

    @Test
    public void testDecodeGpsWithChecksumHasLatLongSatellitesAndChecksumAndSpeed() {
        byte[] input = new byte[]{1, 2, 3};
        Position position = Mockito.mock(Position.class);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, true, false, true, new Checksum());

        assertEquals(5, ((Position) result).getLatitude(), 0.001);
        assertEquals(6, ((Position) result).getLongitude(), 0.001);
    }

}