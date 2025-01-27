package org.stellar.sdk;

public class GeneratedTestGetSecretKey {

    public String getPublicString() {
        return "This is a public method";
    }

    public int getPublicInt() {
        return 1;
    }
}

class Test {

    @Test
    public void testGetSecretKey() {
        SecretKey secretKey = new PublicClass().getKey();
        assertTrue(secretKey != null);
    }

}