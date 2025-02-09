package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testSign() throws Exception {
        KeyPair keyPair = new KeyPair(new byte[]{1, 2, 3}, new byte[]{4, 5, 6});
        ByteArrayOutputStream ByteArrayOutputStream = new ByteArrayOutputStream();
        byte[] signature = new byte[]{7, 8, 9};
        assertEquals(signature, keyPair.sign(signature));
    }
}

@Test
public void testVerifyValidSignature() throws Exception {
    KeyPair keyPair = new KeyPair(new byte[]{1, 2, 3}, new byte[]{4, 5, 6});
    Signature signature = new Signature(keyPair.sign(new byte[]{7, 8, 9}));
    assertTrue(keyPair.verify(signature.getData()));
}

@Test
public void testVerifyInvalidSignature() throws Exception {
    KeyPair keyPair = new KeyPair(new byte[]{1, 2, 3}, new byte[]{4, 5, 6});
    Signature signature = new Signature("signature_data");
    assertFalse(keyPair.verify(signature.getData()));
}
	}

@Test
public void testData() {
    String data = "signature_data";
    assertEquals(data, ((Signature) null).getData());
}

@Test
public void testCreateByteArrayOutputStream() {
    ByteArrayOutputStream bytes = new ByteArrayOutputStream();
    byte[] signature = new byte[]{1, 2, 3};
    Signature signatureObject = new Signature(signature);
    assertEquals(signature, signatureObject.getData());
}
	}

@Test
public void testData() {
    byte[] data1 = {4, 5, 6};
    ByteArrayOutputStream bytes = new ByteArrayOutputStream();
    byte[] data2 = {7, 8, 9};
    KeyPair keyPair = new KeyPair(data1, data2);
    assertEquals(data2, keyPair.sign(data2));
}

@Test
public void testVerifyKeyPair() {
    KeyPair keyPair = new KeyPair(new byte[]{4, 5, 6}, new byte[]{7, 8, 9});
    Signature signature = new Signature(keyPair.sign(new byte[]{1, 2, 3}));
    assertTrue(keyPair.verify(signature.getData()));
}
		}

public class ByteArrayOutputStream {

    private StringBuilder sb;

    public ByteArrayOutputStream() {
        this.sb = new StringBuilder();
    }

    public void append(String data) {
        sb.append(data);
    }

    public String getData() {
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (!(obj instanceof ByteArrayOutputStream))
            return false;
        else
            return sb.toString().equals(((ByteArrayOutputStream) obj).getData());
    }

}