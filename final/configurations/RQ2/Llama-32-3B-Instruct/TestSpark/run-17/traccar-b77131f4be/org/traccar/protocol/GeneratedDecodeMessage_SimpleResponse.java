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

public class GeneratedDecodeMessage_SimpleResponse {

    @Test
    public void decodeMessage_SimpleResponse() throws Exception {
        List<Byte> data = new ArrayList<>();
        data.add(0x01);
        data.add(0x02);

        GalileoMessageTestHelper helper = new GalileoMessageTestHelper(data);
        assertTrue(helper.decode());
    }

}