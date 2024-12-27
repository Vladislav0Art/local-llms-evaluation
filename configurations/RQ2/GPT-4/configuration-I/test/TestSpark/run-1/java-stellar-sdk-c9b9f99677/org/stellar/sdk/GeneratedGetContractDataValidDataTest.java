package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedGetContractDataValidDataTest {

    @Test
    public void getContractDataValidDataTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        String contractId = "contract123";  // assuming valid contractId
        SCVal key = new SCVal("key");  // assuming valid key
        Durability durability = Durability.IMMEDIATE;
        Optional<GetLedgerEntriesResponse.LedgerEntryResult> response = server.getContractData(contractId, key, durability);
        Assert.assertTrue(response.isPresent());
    }

}