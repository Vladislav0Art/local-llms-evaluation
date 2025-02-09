package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestVerifyKeyPair {

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