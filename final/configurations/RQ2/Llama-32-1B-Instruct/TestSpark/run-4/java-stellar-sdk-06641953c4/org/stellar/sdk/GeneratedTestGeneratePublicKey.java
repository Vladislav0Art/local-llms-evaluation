package org.stellar.sdk;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGeneratePublicKey {

    @Test
    public void testGeneratePublicKey() {
        String publicKey = "-----BEGIN PUBLIC KEY-----\nMiIQABAgIVAwIBAgIVAKAM4GAYIKBQENBgQCMA0GCawAGFAA/9w8GDgU\nMIIKzBIANhIAr3f5lI6DkE2dHmP3RZ1FhT09jN2oL2V0aWUzMQgoSDwQGBgSEAgIBBQJ\nAkwIBBgcGBS/zwIBADQEBBAwiAFABsDASQBgsGA9BIEAwIBBgcGBS/zwIBADQEBBAwiAFAB\nsaawIBQgJGIMyXU0PDREb3pzbC8xL1NlcjoiRk4xL1N9yY2FzaWQUBAQBsb29wLW50bW4gVGhpcyBpbmdpbmsgcHBvc2ZvcmQgdGhybmxhbmx0aWcgbTmMgVjzva3KfB9ybXMgdGkpc3RydXRvbS9zdGF0aWMgdGVudCBpbiBBIFRoa25lc3QxL2FwbA==\n-----END PUBLIC KEY-----";
        Assert.assertFalse(GeneratedTest.generatePublicKey().isPresent());
    }

}