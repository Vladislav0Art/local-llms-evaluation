package org.stellar.sdk;

public class GeneratedTestVerifySingleCharacterData {

    public String getPublicString() {
        return "This is a public method";
    }

    public int getPublicInt() {
        return 1;
    }
}

class Test {

    @Test
    public void testVerifySingleCharacterData() {
        Llama32_3B_Instruct_TestSpark verify = new Llama32_3B_Instruct_TestSpark();
        assertTrue(verify.verify("1"));
    }

}