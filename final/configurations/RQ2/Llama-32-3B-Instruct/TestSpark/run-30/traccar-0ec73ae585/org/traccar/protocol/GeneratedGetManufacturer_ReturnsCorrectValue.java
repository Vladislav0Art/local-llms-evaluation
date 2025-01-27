package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.WatchProtocolEncoder;
import org.traccar.model.Position;
import org.traccar.helper.Parser;

public class GeneratedGetManufacturer_ReturnsCorrectValue {

    @Test
    public void getManufacturer_ReturnsCorrectValue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertEquals("Watch", decoder.getManufacturer());
    }

}