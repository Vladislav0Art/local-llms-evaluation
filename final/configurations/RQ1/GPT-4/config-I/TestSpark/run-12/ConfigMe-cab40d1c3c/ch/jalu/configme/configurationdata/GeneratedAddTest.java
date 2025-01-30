package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class GeneratedAddTest {

    @Test
    public void addTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property prop1 = new StringProperty("Test.Property1", "default");
        Property prop2 = new StringProperty("Test.Property2", "default2");
        propertyListBuilder.add(prop1);
        propertyListBuilder.add(prop2);

        List<Property<?>> propertyList = propertyListBuilder.create();

        // Both properties should be presents in the list
        assertThat(propertyList, hasItems(prop1, prop2));
    }

}