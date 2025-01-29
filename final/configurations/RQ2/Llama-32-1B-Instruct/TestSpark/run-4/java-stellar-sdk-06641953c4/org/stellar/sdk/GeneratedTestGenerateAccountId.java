package org.stellar.sdk;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGenerateAccountId {

    @Test
    public void testGenerateAccountId() {
        String id = "12345";

        Assert.assertTrue(GeneratedTest.generateAccountId(id).isPresent());

        Assert.assertFalse(GeneratedTest.generateAccountId("abcdef").isPresent());
    }

}