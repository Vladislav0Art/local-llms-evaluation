package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void decodeGps_NoPosition_ThrowsException() {
        assertTrue(Gt06ProtocolDecoder.decodeGps(null, null, false, null));
    }

    @Test
    public void decodeGps_PositionValid_GpsDataReturned() {
        Position position = new Position(12.34, -56.78, 1024);
        boolean hasLength = true;
        Calendar calendar = Calendar.getInstance();
        TimeZone timezone = calendar.getTimeZone("America/New_York");
        Date gpsDate = DateBuilder.buildGpsDate(position.getTimestamp(), timezone);
        boolean gpsDataReturned = Gt06ProtocolDecoder.decodeGps(position, null, hasLength, null, null, gpsDate);
        assertNotNull(gpsDataReturned);
    }

    @Test
    public void decodeGps_NoLength_ThrowsException() {
        assertTrue(Gt06ProtocolDecoder.decodeGps(null, null, false, null));
    }

    @Test
    public void decodeGps_PositionValid_GpsDataReturnedWithLength() {
        Position position = new Position(12.34, -56.78, 1024);
        boolean hasLength = true;
        Calendar calendar = Calendar.getInstance();
        TimeZone timezone = calendar.getTimeZone("America/New_York");
        Date gpsDate = DateBuilder.buildGpsDate(position.getTimestamp(), timezone);
        boolean gpsDataReturned = Gt06ProtocolDecoder.decodeGps(position, null, hasLength, null, null, gpsDate);
        assertNotNull(gpsDataReturned);
    }

    @Test
    public void decodeGps_PositionValid_GpsSatellitesInformationReturned() {
        Position position = new Position(12.34, -56.78, 1024);
        boolean hasLength = true;
        Calendar calendar = Calendar.getInstance();
        TimeZone timezone = calendar.getTimeZone("America/New_York");
        Date gpsDate = DateBuilder.buildGpsDate(position.getTimestamp(), timezone);
        boolean gpsDataReturned = Gt06ProtocolDecoder.decodeGps(position, null, hasLength, true, false, gpsDate);
        assertNotNull(gpsDataReturned);
    }

    @Test
    public void decodeGps_PositionValid_GpsSpeedInformationReturned() {
        Position position = new Position(12.34, -56.78, 1024);
        boolean hasLength = true;
        Calendar calendar = Calendar.getInstance();
        TimeZone timezone = calendar.getTimeZone("America/New_York");
        Date gpsDate = DateBuilder.buildGpsDate(position.getTimestamp(), timezone);
        boolean gpsDataReturned = Gt06ProtocolDecoder.decodeGps(position, null, hasLength, false, true, gpsDate);
        assertNotNull(gpsDataReturned);
    }

    @Test
    public void decode_ThrowsException() {
        assertTrue(Gt06ProtocolDecoder.decode(null, null, null));
    }

    @Test
    public void decode_PositionValid_Gt06DecoderCreated() {
        Position position = new Position(12.34, -56.78, 1024);
        Network network = new Network();
        boolean hasLength = true;
        Calendar calendar = Calendar.getInstance();
        TimeZone timezone = calendar.getTimeZone("America/New_York");
        Date gpsDate = DateBuilder.buildGpsDate(position.getTimestamp(), timezone);
        Gt06ProtocolDecoder decoder = (Gt06ProtocolDecoder) Gt06ProtocolDecoder.decode(network, null, position, hasLength, gpsDate);
        assertNotNull(decoder);
    }

}