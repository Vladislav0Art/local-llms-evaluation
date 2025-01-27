package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSignDecorated_GivenData_ReturnsDecoratedSignature {

    @Test
    public void signDecorated_GivenData_ReturnsDecoratedSignature() {
        byte[] data = "my_data".getBytes();
        DecoratedSignature decoratedSignature = new DecoratedSignature();
        KeyPair keyPair = new KeyPair(decoratedSignature);
        assertArrayEquals(data, keyPair.signDecorated(data));
    }

}