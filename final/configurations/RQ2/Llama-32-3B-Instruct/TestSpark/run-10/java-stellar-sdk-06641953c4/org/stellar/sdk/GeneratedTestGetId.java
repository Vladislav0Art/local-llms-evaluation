package org.stellar.sdk;

public class GeneratedTestGetId {

    public String getPublicString() {
        return "This is a public method";
    }

    public int getPublicInt() {
        return 1;
    }
}

class Test {

    @Test
    public void testGetId() {
        AccountId accountId = new AccountId("1234567890");
        assertEquals("1234567890", accountId.getId());
    }

}