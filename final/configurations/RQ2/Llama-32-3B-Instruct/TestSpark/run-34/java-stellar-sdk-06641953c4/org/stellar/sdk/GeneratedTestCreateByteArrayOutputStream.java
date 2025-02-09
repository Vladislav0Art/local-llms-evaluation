package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCreateByteArrayOutputStream {

    @Test
    public void testCreateByteArrayOutputStream() {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        byte[] signature = new byte[]{1, 2, 3};
        Signature signatureObject = new Signature(signature);
        assertEquals(signature, signatureObject.getData());
    }
}

}