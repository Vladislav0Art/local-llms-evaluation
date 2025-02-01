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

public class GeneratedAddPropertyWhenListItemExistsTest {

    @Test
    public void addPropertyWhenListItemExistsTest() {
        // Arrange
        Property<?> property1 = new StringProperty("db.password", "secret");
        Property<?> property2 = new StringProperty("db.user", "john");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property1);

        // Act
        propertyListBuilder.add(property2);
        List<Property<?>> result = propertyListBuilder.create();

        // Assert
        assertThat(result.size(), is(2));
        assertThat(result.get(1), equalTo(property2));
    }

}