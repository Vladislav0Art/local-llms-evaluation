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

public class GeneratedAddPropertyWhenDuplicateExistsTest {

    @Test
    public void addPropertyWhenDuplicateExistsTest() {
        // Arrange
        Property<?> property1 = new StringProperty("db.password", "secret");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property1);

        try {
            // Act
            propertyListBuilder.add(property1);
            fail("Expected exception not thrown");
        } catch (ConfigMeException ex) {
            // Assert
            assertThat(ex.getMessage(), equalTo("Path at 'db.password' already exists"));
        }
    }

}