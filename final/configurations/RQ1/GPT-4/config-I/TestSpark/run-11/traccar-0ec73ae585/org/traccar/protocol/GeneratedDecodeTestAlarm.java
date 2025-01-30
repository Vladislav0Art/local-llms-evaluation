package org.traccar.protocol;

import org.junit.Test;
import org.traccar.DatabaseManager;
import org.traccar.GlobalContext;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;

import static org.junit.Assert.*;

public class GeneratedDecodeTestAlarm {

    private final WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch", 0, false, false, null));

    @Test
    public void decodeTestAlarm() throws Exception {
        assertNull(decoder.decode(null, null, "[3G*4700189114*0009*VERON1234]"));
        assertEquals("Position{protocol='watch', deviceId=0, serverTime=null, deviceTime=null, fixTime=null, valid=false, latitude=0.0, longitude=0.0, altitude=0.0, speed=0.0, course=0.0, address=null, accuracy=0.0, network=null, Attributes={sosButton=true, alarm=sos, rssi=1, steps=8, charge=100, alarmValue=Bm, batLvl=1}, Attributes={pressureHigh=78, pressureLow=52, location3=true, heartrate=78, sagenum=1, alarmValue=Bm, batLvl=1}}", decoder.decode(null, null, "[3G*884167040095868*0011*BP,78,52,78,1]").toString());
    }

}