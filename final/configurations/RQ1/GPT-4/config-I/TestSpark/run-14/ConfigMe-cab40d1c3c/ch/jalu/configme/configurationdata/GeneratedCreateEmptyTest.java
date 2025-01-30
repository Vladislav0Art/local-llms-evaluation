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

public class GeneratedCreateEmptyTest {

    @Test
    public void createEmptyTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        List<Property<?>> properties = builder.create();

        // Assert
        assertThat(properties.size(), is(0));
    }

}