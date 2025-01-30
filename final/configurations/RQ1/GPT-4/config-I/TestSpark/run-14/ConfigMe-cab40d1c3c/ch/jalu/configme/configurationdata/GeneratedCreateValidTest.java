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

public class GeneratedCreateValidTest {

    @Test
    public void createValidTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new StringProperty("config.me", "defaultValue");

        // Act
        builder.add(property);
        List<Property<?>> properties = builder.create();

        // Assert
        assertThat(properties.size(), is(1));
        assertThat(properties.get(0), is(property));
    }

}