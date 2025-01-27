package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;

public class GeneratedDecode_PositionValid_Gt06DecoderCreated {

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