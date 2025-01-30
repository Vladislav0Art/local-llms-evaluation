package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class GeneratedAddValidPropertyTest {

    @Test
    public void addValidPropertyTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new StringProperty("config.me", "defaultValue");

        // Act
        builder.add(property);

        // Assert
        assertThat(builder.getRootEntries().size(), is(1));
    }

}