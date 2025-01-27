package org.stellar.sdk;

public class GeneratedTest {

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

public class TestPublicKeys {

}