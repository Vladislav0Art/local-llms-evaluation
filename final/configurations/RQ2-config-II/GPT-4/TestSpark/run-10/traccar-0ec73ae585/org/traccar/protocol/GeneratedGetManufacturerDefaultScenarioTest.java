package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.StringProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetManufacturerDefaultScenarioTest {

    @Test
    public void getManufacturerDefaultScenarioTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol(""));
        assertNull(watchProtocolDecoder.getManufacturer());
    }

}