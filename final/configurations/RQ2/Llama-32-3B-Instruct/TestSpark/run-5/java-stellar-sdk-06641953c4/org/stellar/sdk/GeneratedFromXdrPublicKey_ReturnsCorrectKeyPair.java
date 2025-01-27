package org.stellar.sdk;

public class GeneratedFromXdrPublicKey_ReturnsCorrectKeyPair {

    @Test
    public void fromXdrPublicKey_ReturnsCorrectKeyPair() {
        PublicKey expectedPublicKey = new PublicKey(new Uint256("1234567890"));
        PublicKey actualPublicKey = KeyPair.fromXdrPublicKey(expectedPublicKey);
        assertEquals(expectedPublicKey, actualPublicKey);
    }
}

public class GeneralSecurityException extends Exception {
}

}