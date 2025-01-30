package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.traccar.BaseTest;
import org.traccar.ProtocolTest;
import org.traccar.model.Position;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestDecode {

    @Test
    public void testDecode() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new GalileoProtocol());

        verifyNull(decoder, binary(
                "01cc0003000000004242424242424242424242000001010101000446030001760agu"));

        verifyPositions(decoder, binary(
                "01cc004d0000000042424242424242424242002047454c444d30352f32302f32302031303a33353a3031204c4f54203d20323331302e38383230204e53502c204c4f4e20303433322e373632322045572c20535044203d20302e3030204b544e532c20485447203d203330302e31360d0a"));

        verifyPositions(decoder, binary(
                "01000000000000352e31352e31352e313131c0a82300003f424242424200001e6ea9f0"));

        verifyPositions(decoder, binary(
                "0164000000008b0000000000000000000000000bc102090101d2061be60801005004b0002c9c3c88605808000003c9"));

        verifyAttribute(decoder, binary(
                        "0100000000000901c0a8a6e40000003f424242424200001fd8f17e"),
                Position.KEY_RESULT, "Unknown tag: 0x09");

        verifyAttribute(decoder, binary(
                        "01640000000056000000744e505a4b34564e5958000bc102090101bb061b69080100580450002c8c3a8d050801000098b"),
                "can8BitR0", 88.0);

        verifyAttribute(decoder, binary(
                        "0100000000000901c0a8a6e40000003f424242424200001fd8f17e"),
                Position.KEY_RESULT, "Unknown tag: 0x09");

        verifyAttribute(decoder, binary(
                        "01640000000056000000744e505a4b34564e5958000bc102090101bb061b69080100580450002c8c3a8d050801000098b"),
                "can8BitR0", 88.0);

        verifyAttribute(decoder, binary(
                        "0100000000008901f245daa66309040693e8e8c8aad9dfeee0e96f16040f27c3dc4201a8194c95707eb36460c3048eb9e8301b8751bcda086f0402fe8bf7e89a78593ed6fd813a52093c7e1ca12400005a00"),
                "tagData4", 4255700487608344L);

        verifyAttribute(decoder, binary(
                        "01640000000056000000744e505a4b34564e5958000b0109000100000c013c0000000000008403b9aca00001fd8df1"),
                Position.PREFIX_ADC + 1, 28.0);

        verifyNull(decoder, binary(
                "01cc0003010000004242424242"));

        verifyPositions(decoder, binary(
                "01640000000056000000744e505a4b34564e5958000b0109000100000c013c0000000000008403b9aca00001fd8df1"));

        verifyNull(decoder, binary(
                "01cc0003010000004242424242"));

        verifyPositions(decoder, binary(
                "01640000000022000000000000000000000000000bc102090101d2061db80801000c032000f5000b00003e9"));

        verifyPositions(decoder, binary(
                "013400000000011e6401341f40001fd8ed5"));

        verifyPositions(decoder, binary(
                "011e6401341f40001fd8ed5"));

        verifyPositions(decoder, binary(
                "01102164123400000000000001fd8f4c"));

        verifyNull(decoder, binary(
                "01cc0003000000004242424242424242424242000001010101000446030001760b4f"));

        verifyAttribute(decoder, binary(
                        "01640000000056000000744e505a4b34564e5958000b0109000100000c013b0000000000008303b9aca00001fd8f12"),
                Position.PREFIX_ADC + 1, 27.0);

        verifyNull(decoder, binary(
                "01cc0003010000004242424242"));

        verifyPositions(decoder, binary(
                "01640000000056000000744e505a4b34564e5958000b0109000100000c013b0000000000008303b9aca00001fd8f12"));

        verifyAttribute(decoder, binary(
                        "011000000000546573742044657669636520312020202001fd8ece"),
                Position.PREFIX_TEMP + 1, -40.0);

        verifyAttribute(decoder, binary(
                        "011000000000546573742044657669636520312020202001fd8ece"),
                Position.PREFIX_TEMP + 1, -40.0);

        verifyNull(decoder, binary(
                "01cc0003010000004242424242"));

        verifyAttribute(decoder, binary(
                        "010000000000011e6401321f40001fd8ea8"),
                Position.KEY_SPEED, 100.0);

        verifyPositions(decoder, binary(
                "010000000000011e6401321f40001fd8ea8"));

        verifyNull(decoder, binary(
                "01cc0003010000004242424242"));

        verifyNull(decoder, binary(
                "01cc00030000000042424242424242424242420000010101010004460300018f87a"));

        verifyNull(decoder, binary(
                "01cc0003010000004242424242"));
    }

}