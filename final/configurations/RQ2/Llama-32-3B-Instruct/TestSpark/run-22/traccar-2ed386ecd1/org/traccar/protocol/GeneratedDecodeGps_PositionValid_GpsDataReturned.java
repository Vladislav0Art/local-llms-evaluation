package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;

public class GeneratedDecodeGps_PositionValid_GpsDataReturned {

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

}