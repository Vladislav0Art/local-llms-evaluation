package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolDecoderTest;
import org.traccar.ProtocolTest;

import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    public WatchProtocolDecoderTest() {
        super(new WatchProtocolDecoder(new Protocol("watch", 0)));
    }

    @Test
    public void decodePositionDataErrorTest() {
        assertNull(decoder.decode(null, null, StandardCharsets.US_ASCII.encode("[CS*123456789012345*LK,8,100]")));
    }

    @Test
    public void decodePositionDataTest() {
        assertNotNull(decoder.decode(null, null, StandardCharsets.US_ASCII.encode("[3G*4700184321*00D4*UD,080520,053851,A,45.948567,N,6.132413,E,0.04,0.00,575.00,0,0,87,92,-11,4,9de4,E8216b4f80,150,-72,0f368dcf39,131,-70,WIFI!0b]")));
    }

    @Test
    public void decodeAlarmDataTest() {
        assertNotNull(decoder.decode(null, null, StandardCharsets.US_ASCII.encode("[3G*4700184321*00D4*AL,080520,053851,A,45.948567,N,6.132413,E,0.04,0.00,575.00,0,0,87,92,-11,4,9de4,E8216b4f80,150,-72,0f368dcf39,131,-70,WIFI!0b]")));
    }

    @Test
    public void decodeImageDataTest() {
        assertNotNull(decoder.decode(null, null, StandardCharsets.US_ASCII.encode("[YW*4700184321*00F6*IMG,1F10,0,2,E8216b4f80,150,-72,0f368dcf39,131,-70,WIFI!0b]")));
    }

    @Test
    public void decodeInitializationTest() {
        assertNull(decoder.decode(null, null, StandardCharsets.US_ASCII.encode("[YW*4700184321*0002*INIT]")));
    }

    @Test
    public void decodeLkCommandTest() {
        assertNotNull(decoder.decode(null, null, StandardCharsets.US_ASCII.encode("[YW*4700184321*000D*LK,100,5]")));
    }

    @Test
    public void decodeAudioTest() {
        assertNotNull(decoder.decode(null, null, StandardCharsets.US_ASCII.encode("[YW*4700184321*016C*TK,1,1,8000,1,4,00029CA8,29A8,C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2]")));
    }

    @Test
    public void decodeHealthTest() {
        assertNotNull(decoder.decode(null, null, StandardCharsets.US_ASCII.encode("[YW*4700184321*00BA*HEART,92]")));
    }

    @Test
    public void decodeTemperatureTest() {
        assertNotNull(decoder.decode(null, null, StandardCharsets.US_ASCII.encode("[YW*4700184321*0072*TEMP,29]")));
    }

}