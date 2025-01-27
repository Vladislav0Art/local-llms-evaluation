package org.stellar.sdk;

public class GeneratedTestGetPublicKey {

    public String getPublicString() {
        return "This is a public method";
    }

    public int getPublicInt() {
        return 1;
    }
}

class Test {

    @Test
    public void testGetPublicKey() {
        PublicKey publicKey = new PublicClass().getPublic();
        assertTrue(publicKey != null);
    }

}