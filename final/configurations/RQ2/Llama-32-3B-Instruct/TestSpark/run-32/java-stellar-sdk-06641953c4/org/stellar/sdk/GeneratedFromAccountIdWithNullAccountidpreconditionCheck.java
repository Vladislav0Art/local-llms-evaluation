package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;
import java.security.SignatureException;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedFromAccountIdWithNullAccountidpreconditionCheck {

    @Test
    public void fromAccountIdWithNullAccountidpreconditionCheck() {
        KeyPair keyPair = KeyPair.fromAccountId(null);
    }

}