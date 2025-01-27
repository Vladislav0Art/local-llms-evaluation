package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedSign_SingleCharacterData_ReturnsSignature {

    @Test
    public void sign_SingleCharacterData_ReturnsSignature() throws Exception {
        String singleCharacterData = "data";
        Signature signature = Llama32_3B_Instruct_TestSpark.sign(singleCharacterData);
        assertNotNull(signature.getValue());
    }

}