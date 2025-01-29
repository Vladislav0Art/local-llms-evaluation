package org.stellar.sdk;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGenerateEddsa {

    @Test
    public void testGenerateEddsa() {
        int secretSeed = 123;
        String publicKey = "-----BEGIN PUBLIC KEY-----\nMIIGjCCAjAGEAQAwIBAgIVAKAM4GAYIKBQENBgQCMA0GCawAGFAA/9w8GDgU\nMIIKzBIANhIAr3f5lI6DkE2dHmP3RZ1FhT09jN2oL2V0aWUzMQgoSDwQGBgSEAgIBBQJ\nAkwIBBgcGBS/zwIBADQEBBAwiAFABsDASQBgsGA9BIEAwIBBgcGBS/zwIBADQEBBAwiAFAB\nsawIBBgcGBS/zwIBADQEBBAwiAFABsaawIBQgJGIMyXU0PDREb3pzbC8xL1NlcjoiRk4xL1\nNl9yY2FzaWQUBAQBsb29wLW50bW4gVGhpcyBpbmdpbmsgcHBvc2ZvcmQgdGhybmxhbmx0aW\ncgbTmMgVjzva3KfB9ybXMgdGkpc3RydXRvbS9zdGF0aWMgdGVudCBpbiBBIFRoa25lc3Qx\nL2FwbA==\n-----END PUBLIC KEY-----";

        String id = "12345";
        int accountId = 678;
        String publicKeyId = id + "-" + accountId;

        Assert.assertTrue(GeneratedTest.generateEddsa(secretSeed, publicKey, id, accountId).isPresent());
    }

}