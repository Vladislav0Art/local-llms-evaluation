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

public class GeneratedDecodeMessage_NoMessage {

    @Test
    public void decodeMessage_NoMessage() throws Exception {
        List<Byte> data = new ArrayList<>();

        GalileoMessageTestHelper helper = new GalileoMessageTestHelper(data);
        assertFalse(helper.decode());
    }

}