package org.jsoup.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestRegisterTagWithSufix {

    private static final String TAG_NAME_PREFIX = "form";
    private static final String TAG_NAME_SUFIX = "-submit";

    @Test
    public void testRegisterTagWithSufix() {
        // Arrange
        Tag tag1 = new Tag("input", true);
        register(tag1);

        // Act
        List<Registration> registrations = getRegistrations();
        for (Registration registration : registrations) {
            System.out.println(registration.getTagName());
        }

        // Assert
        verifyRegistrations(registrations);
    }

}