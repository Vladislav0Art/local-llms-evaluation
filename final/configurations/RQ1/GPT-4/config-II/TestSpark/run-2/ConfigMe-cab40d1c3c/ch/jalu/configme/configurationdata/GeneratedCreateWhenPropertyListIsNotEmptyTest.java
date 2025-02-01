package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class GeneratedCreateWhenPropertyListIsNotEmptyTest {

    @Test
    public void createWhenPropertyListIsNotEmptyTest() {
        // Arrange
        Property<?> property = new StringProperty("db.password", "secret");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property);

        // Act
        List<Property<?>> result = propertyListBuilder.create();

        // Assert
        assertThat(result.size(), is(1));
        assertThat(result.get(0), equalTo(property));
    }

}