package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedGetLedgerEntriesValidKeysTest {

    @Test
    public void getLedgerEntriesValidKeysTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        Collection<LedgerKey> keys = new ArrayList<>();  // assuming valid keys
        GetLedgerEntriesResponse response = server.getLedgerEntries(keys);
        Assert.assertNotNull(response);
    }

}