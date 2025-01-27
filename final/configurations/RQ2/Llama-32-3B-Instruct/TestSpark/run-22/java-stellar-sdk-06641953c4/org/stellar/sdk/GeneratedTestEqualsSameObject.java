package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestEqualsSameObject {

    private String value;

    public PublicKey(String value) {
        this.value = value;
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

    public Signature(String value) {
        this.value = value;
    }

    public boolean verify(PublicKey publicKey) {
        return publicKey.value.equals(this.value);
    }
}

import org.junit.Test;
import static org.junit.Assert .*;

public class PublicKeyTest {

    @Test
    public void testEqualsSameObject() {
        PublicKey publicKey1 = new PublicKey("1234567890");
        PublicKey publicKey2 = new PublicKey("1234567890");

        assertTrue(publicKey1.equals(publicKey2));
    }

}