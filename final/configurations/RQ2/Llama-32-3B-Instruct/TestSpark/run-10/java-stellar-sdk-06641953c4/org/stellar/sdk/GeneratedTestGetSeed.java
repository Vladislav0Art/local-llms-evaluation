package org.stellar.sdk;

public class GeneratedTestGetSeed {

    public String getPublicString() {
        return "This is a public method";
    }

    public int getPublicInt() {
        return 1;
    }
}

class Test {

    @Test
    public void testGetSeed() {
        Bip39Seed bip39Seed = new Bip39Seed("1234567890");
        assertEquals("1234567890", bip39Seed.getSeed());
    }

}