package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.helper.BitUtil;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder.GalileoMessageTestHelper;
import org.traccar.protocol.GalileoProtocolDecoder.GalileoDecodeScenarioTestHelper;

public class GeneratedDecodeMessage_DateInvalid {

    @Test
    public void decodeMessage_DateInvalid() throws Exception {
        Date date = new Date();
        Position position = new Position(date, 0.0, 0.0);

        BitBuffer bitBuffer = new BitBuffer();
        bitBuffer.putByte(0x01);
        bitBuffer.putByte(0x02);

        GalileoDecodeScenarioTestHelper helper = new GalileoDecodeScenarioTestHelper(position, bitBuffer);
        assertFalse(helper.decode());
    }

}