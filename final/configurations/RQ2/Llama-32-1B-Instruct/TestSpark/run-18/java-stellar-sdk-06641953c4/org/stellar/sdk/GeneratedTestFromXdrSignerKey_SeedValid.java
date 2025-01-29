package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestFromXdrSignerKey_SeedValid {

    @Test
    public void testFromXdrSignerKey_SeedValid() {
        SignerKey signerKey = fromXdrSignerKey("your_secret_seed_here");
        assert checkSign(signerKey.sign("test_data"));
    }

    private SignerKey fromXdrSignerKey(String secretSeed) {
        byte[] data = "your_secret_seed_here".getBytes();
        return new SignerKey(new XdrData(data));
    }

}