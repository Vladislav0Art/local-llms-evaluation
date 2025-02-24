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
public class GeneratedTestWatchProtocolDecoderDecode {

    @Mock
    private BaseProtocolDecoder baseProtocolDecoder;

    @Test
    public void testWatchProtocolDecoderDecode() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());
        Object decode = watchProtocolDecoder.decode(null, null, null);
        assertNull(decode);
    }

}