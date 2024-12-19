package org.jsoup.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestRegisterTag {

    private static final String TAG_NAME_PREFIX = "form";
    private static final String TAG_NAME_SUFIX = "-submit";

    @Test
    public void testRegisterTag() {
        // Arrange
        Tag tag1 = new Tag("button");
        register(tag1);

        Tag tag2 = new Tag("input", true);
        register(tag2);

        // Act
        List<Registration> registrations = getRegistrations();
        for (Registration registration : registrations) {
            System.out.println(registration.getTagName());
        }

        // Assert
        verifyRegistrations(registrations);
    }

}