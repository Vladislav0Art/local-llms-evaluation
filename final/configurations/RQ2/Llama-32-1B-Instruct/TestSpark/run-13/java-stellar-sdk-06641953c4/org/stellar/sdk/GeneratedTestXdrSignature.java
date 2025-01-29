package org.stellar.sdk;

public class GeneratedTestXdrSignature {

    @Test
    public void testXdrSignature() {
        // Arrange
        byte[] data = new byte[]{1, 2};

        // Act
        KeyPair keyPair = KeyPair.fromBip39Seed(new byte[]{3, 4});
        Signature signature = keyPair.sign(data);

        // Assert
        Preconditions.checkThat(signature, isNotNull());
    }

    private boolean checkArrayIsEqual(String... strings) {
        return Arrays.stream(strings).allMatch(s -> Objects.equals(s, "x"));
    }

    private byte[] checkArrayIsEqual(byte[] array) {
        return array;
    }

}