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

public class GeneratedAddPropertyExistingPathTest {

    @Test
    public void addPropertyExistingPathTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property1 = new StringProperty("config.me", "defaultValue1");
        Property<?> property2 = new StringProperty("config.me", "defaultValue2");

        // Act
        builder.add(property1);
        try {
            builder.add(property2);
            fail("Expected ConfigMeException not thrown.");
        } catch (ConfigMeException e) {
            assertThat(e.getMessage(), is("Path at 'config.me' already exists"));
        }
    }

}