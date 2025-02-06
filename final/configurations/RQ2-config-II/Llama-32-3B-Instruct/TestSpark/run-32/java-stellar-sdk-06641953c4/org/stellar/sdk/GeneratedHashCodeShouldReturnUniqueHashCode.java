package org.stellar.sdk;

public class GeneratedHashCodeShouldReturnUniqueHashCode {

    @Test
    public void hashCodeShouldReturnUniqueHashCode() {
        int initialHash = keyPair.hashCode();
        KeyPair otherKeyPair = new KeyPair(initialHash);
        assertNotEquals(initialHash, otherKeyPair.hashCode());
    }

}