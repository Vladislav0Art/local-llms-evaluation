package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        String seed = "SDMDOMLNTWYT3JZPDLXTQL4UNRNKHS4J5DTSEXNBK3YXI3RGQBBNMIBQ";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals("GCUKMGTHGLBYHOBMCCIYPBUOYDTGJPW2PJUJRLKPWCGVO6HNEHIFGGYF", keyPair.getAccountId());
    }

}