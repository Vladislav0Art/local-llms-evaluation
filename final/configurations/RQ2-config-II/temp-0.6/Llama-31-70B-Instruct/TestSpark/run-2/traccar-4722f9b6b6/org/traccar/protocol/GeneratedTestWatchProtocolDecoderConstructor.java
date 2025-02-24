package org.traccar.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestWatchProtocolDecoderConstructor {

    @Mock
    private BaseProtocolDecoder baseProtocolDecoder;

    @Test
    public void testWatchProtocolDecoderConstructor() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());
        assertEquals(watchProtocolDecoder.getHasIndex(), false);
        assertEquals(watchProtocolDecoder.getManufacturer(), "");
    }

}