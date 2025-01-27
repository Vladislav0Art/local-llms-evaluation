package org.traccar.protocol;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    public void decode(ByteBuf byteBuf) {
        int version = byteBuf.readInt();
        long seqNum = byteBuf.readLong();

        System.out.println("Decoded version: " + version);
        System.out.println("Decoded seqNum: " + seqNum);
    }
}

public class WatchProtocolDecoderFactory {

    public static WatchProtocolDecoder create() {
        return new WatchProtocolDecoder();
    }
}

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

}