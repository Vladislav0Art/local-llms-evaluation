package org.traccar.protocol;

import org.junit.beforeClass;
import org.junit.Test;

public class GeneratedTest {

    private static final int DATA_LENGTH = 10;

    public static GalileoProtocolDecoder createGalileoProtocolDecoder(byte[] data) {
        if (data == null || data.length != DATA_LENGTH) {
            throw new IllegalArgumentException("Invalid input");
        }
        return new GalileoProtocolDecoder();
    }

    public static GalileoProtocolDecoder createGalileoProtocolDecoder() {
        byte[] data = generateValidData();
        return createGalileoProtocolDecoder(data);
    }

    private static byte[] generateValidData() {
        byte[] data = new byte[DATA_LENGTH];
        data[0] = 11;
        return data;
    }
}

public class TestUtil {
    public static GalileoProtocolDecoder createGalileoProtocolDecoder() {
        byte[] data = generateValidData();
        return new GalileoProtocolDecoderFactory().createGalileoProtocolDecoder(data);
    }

    private static final int DATA_LENGTH = 10;

    public static byte[] generateValidData() {
        byte[] data = new byte[DATA_LENGTH];
        data[0] = 11;
        return data;
    }
}

public class GalileoProtocolDecoder {
    private boolean decoded = false;

    public void setDecoded(boolean decoded) {
        this.decoded = decoded;
    }

    public boolean isDecoded() {
        return decoded;
    }
}

import org.junit.beforeClass;
import org.junit.Test;

public class GeneratedTest {
    @beforeClass
    public static void setup() {
        GalileoProtocolDecoderFactory.factory = new GalileoProtocolDecoratorFactory();
        byte[] data = TestUtil.generateValidData();
        GalileoProtocolDecoder.decoder = GalileoProtocolDecoderFactory.createGalileoProtocolDecoder(data);
    }

}