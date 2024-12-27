package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.protocol.Protocol;

import java.net.SocketAddress;
import java.net.Channel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetManufacturer_DefaultValueTest {

    @Mock
    private Protocol protocol;

    @InjectMocks
    private WatchProtocolDecoder decoder;

    @Test
    public void getManufacturer_DefaultValueTest() {
        assertEquals("", decoder.getManufacturer());
    }

}