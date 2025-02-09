package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestData {

    @Test
    public void testData() {
        byte[] data1 = {4, 5, 6};
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        byte[] data2 = {7, 8, 9};
        KeyPair keyPair = new KeyPair(data1, data2);
        assertEquals(data2, keyPair.sign(data2));
    }

}