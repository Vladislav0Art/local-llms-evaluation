package org.stellar.sdk;

public class GeneratedTest {

    @Test
    public void canSignTrueTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedSeedLengthTest() {
        char[] seed = {'a', 'b', 'c'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(3, seed.length);
    }

    @Test
    public void fromSecretSeedSeedTypeTest() {
        String seed = "abc";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertArrayEquals("abc".getBytes(), seed.getBytes());
    }

}