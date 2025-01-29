package org.stellar.sdk;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGenerateAccountIdWithNonStringId {

    @Test
    public void testGenerateAccountIdWithNonStringId() {
        String nonId = 678;

        Assert.assertFalse(GeneratedTest.generateAccountId(nonId).isPresent());
    }

}