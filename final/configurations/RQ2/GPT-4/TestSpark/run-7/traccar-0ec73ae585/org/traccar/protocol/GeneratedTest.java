package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void getHasIndexTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        boolean testValue = decoder.getHasIndex();
        Assert.assertNotNull(testValue);
    }

    @Test
    public void getManufacturerTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String manufacturer = decoder.getManufacturer();
        Assert.assertNotNull(manufacturer);
    }

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object output = decoder.decode(null, null, "Test message");
        Assert.assertNotNull(output);
    }

}