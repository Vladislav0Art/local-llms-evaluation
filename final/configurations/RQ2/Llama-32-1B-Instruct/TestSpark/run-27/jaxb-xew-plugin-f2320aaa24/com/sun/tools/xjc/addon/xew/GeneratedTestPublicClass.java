package com.sun.tools.xjc.addon.xew;

public class GeneratedTestPublicClass {

    public void publicMethod() {
        System.out.println("Public method");
    }
}

class TestPublicClass {

    @Test
    public void testPublicClass() {
        // Call a private method on the first instance of PublicClass
        if (PublicClass.class.getProtectionDomain().getDeclaredField("publicMethod").getPublicMethodAndReturnsObject()) {
            try {
                PublicClass.publicMethod();
            } catch (Exception e) {
            }

            // Call another public method on the second instance of PublicClass
            if (PublicClass.class.getProtectionDomain().getDeclaredField("publicMethod").getPublicMethodAndReturnsObject()) {
                try {
                    PublicClass.publicMethod();
                } catch (Exception e) {
                }
            }
        }

        // Try to access a private field on the first instance of PublicClass that is not public
        if (!PublicClass.class.getProtectionDomain().hasPrivateFieldOrConstructor("test") && !PublicClass.class.getProtectionDomain().hasAccessorsForVariable("publicMethod")) {
            try {
                System.out.println(PublicClass.test);
            } catch (Exception e) {
            }
        }

        // Try to access a private field on the second instance of PublicClass that is not public
        if (!PublicClass.class.getProtectionDomain().hasPrivateFieldOrConstructor("test") && !PublicClass.class.getProtectionDomain().hasAccessorsForVariable("publicMethod")) {
            try {
                System.out.println(PublicClass.test);
            } catch (Exception e) {
            }
        }

        // Try to access a private field on the first instance of PublicClass
        if (!PublicClass.class.getProtectionDomain().getDeclaredField("test").isAccessible()) {
            try {
                System.out.println(PublicClass.test);
            } catch (Exception e) {
            }
        }
    }

}