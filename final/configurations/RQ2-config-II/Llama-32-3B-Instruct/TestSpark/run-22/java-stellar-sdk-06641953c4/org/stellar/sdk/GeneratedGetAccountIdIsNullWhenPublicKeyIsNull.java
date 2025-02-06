package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetAccountIdIsNullWhenPublicKeyIsNull {

    @Test
    public void getAccountIdIsNullWhenPublicKeyIsNull() {
        assert (null == new KeyPair(null).getAccountId());
    }

}