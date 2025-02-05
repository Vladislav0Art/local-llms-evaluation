package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedGetRootEntriesWithNoPropertiesTest {

    @Test
    public void getRootEntriesWithNoPropertiesTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        Map<String, Object> rootView = builder.getRootEntries();

        // Assert
        Assert.assertTrue(rootView.isEmpty());
    }

}