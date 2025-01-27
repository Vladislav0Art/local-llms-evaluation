package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeManufacturerReturnNullTest {

    @Mock
    private NetworkMessage networkMessage;

    @Mock
    private ByteBuf byteBuf;

    @Test
    public void decodeManufacturerReturnNullTest() {
        Mockito.when(networkMessage.getType()).thenReturn("type");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        String manufacturer = decoder.getManufacturer();
        assertNull(manufacturer);
    }

}