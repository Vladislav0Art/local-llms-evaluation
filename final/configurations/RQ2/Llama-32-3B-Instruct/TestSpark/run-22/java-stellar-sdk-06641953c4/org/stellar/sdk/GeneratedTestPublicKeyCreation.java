package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestPublicKeyCreation {

    private String value;

    public static PublicKey createPublicKey(String value) {
        return new PublicKey(value);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        PublicKey publicKey = (PublicKey) obj;
        return value.equals(publicKey.value);
    }
}

public class Signature {
    private String value;

    public static Signature createSignature(String value) {
        return new Signature(value);
    }

    public boolean verify(PublicKey publicKey) {
        return publicKey.value.equals(this.value);
    }
}

import org.junit.Test;
import static org.junit.Assert .*;

public class PublicKeyTest {

    @Test
    public void testPublicKeyCreation() {
        PublicKey publicKey = PublicKey.createPublicKey("1234567890");
        assertNotNull(publicKey);
    }

}