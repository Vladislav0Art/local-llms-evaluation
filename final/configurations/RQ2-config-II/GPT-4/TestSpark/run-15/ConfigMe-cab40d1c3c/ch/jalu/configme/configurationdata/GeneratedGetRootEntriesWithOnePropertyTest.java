package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedGetRootEntriesWithOnePropertyTest {

    @Test
    public void getRootEntriesWithOnePropertyTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new StringProperty("test.path", "default");
        builder.add(property);

        // Act
        Map<String, Object> rootView = builder.getRootEntries();

        // Assert
        Assert.assertEquals(1, rootView.size());
        Assert.assertTrue(rootView.containsKey(property.getPath()));
        Assert.assertEquals(property.getDefaultValue(), rootView.get(property.getPath()));
    }

}