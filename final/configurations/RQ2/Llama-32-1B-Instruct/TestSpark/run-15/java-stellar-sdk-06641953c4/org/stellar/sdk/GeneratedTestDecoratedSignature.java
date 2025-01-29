package org.stellar.sdk;

import org.junit.Test;

import java.util.Arrays;

public class GeneratedTestDecoratedSignature {

    public static void main(String[] args) {
        new Test().run();
    }

    @Test
    public void testDecoratedSignature() {
        DecoratedSignature decorated = new DecoratedSignature("signature");
        System.out.println(decorated);
    }
}

}