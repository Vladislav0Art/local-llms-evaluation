package org.jsoup.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

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