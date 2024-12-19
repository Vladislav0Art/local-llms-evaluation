package org.jsoup.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestRegisterTagWithoutPrefix {

    private static final String TAG_NAME_PREFIX = "form";
    private static final String TAG_NAME_SUFIX = "-submit";

    @Test
    public void testRegisterTagWithoutPrefix() {
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

    private void register(Tag tag) {
        TagRegistration registration = new TagRegistration(tag);
        tags.put(registration.getTagName(), registration);
    }

    private List<Registration> getRegistrations() {
        return new ArrayList<>();
    }

    private void verifyRegistrations(List<Registration> registrations) {
        for (Registration registration : registrations) {
            if (!registration.isTag() && !registration.isField()) {
                throw new AssertionError("Non-tag field found");
            }
        }
    }

}