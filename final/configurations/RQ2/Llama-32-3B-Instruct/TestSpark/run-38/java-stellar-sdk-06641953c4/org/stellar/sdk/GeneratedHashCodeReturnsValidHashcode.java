package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedHashCodeReturnsValidHashcode {

    @Test
    public void hashCodeReturnsValidHashcode() {
        int hashcode = 12345;
        KeyPair keyPair = new KeyPair();
        keyPair.hashCode();
        assertEquals(hashcode, keyPair.hashCode());
    }

}