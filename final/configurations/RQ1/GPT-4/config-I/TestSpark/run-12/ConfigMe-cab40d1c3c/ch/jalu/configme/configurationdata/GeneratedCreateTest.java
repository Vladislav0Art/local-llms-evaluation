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

public class GeneratedCreateTest {

    @Test
    public void createTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property prop1 = new StringProperty("Test.Property1", "default");
        Property prop2 = new StringProperty("Test.Property2", "default2");
        propertyListBuilder.add(prop1);
        propertyListBuilder.add(prop2);

        List<Property<?>> propertyList = propertyListBuilder.create();

        // Checking the order of insertion
        assertThat(propertyList.get(0), is(prop1));
        assertThat(propertyList.get(1), is(prop2));

        Property prop3 = new StringProperty("Test2.Property1", "default");
        Property prop4 = new StringProperty("Test2.Property2", "default2");
        propertyListBuilder.add(prop3);
        propertyListBuilder.add(prop4);

        List<Property<?>> propertyList2 = propertyListBuilder.create();

        // Checking the order of insertion after new properties added
        assertThat(propertyList2.get(2), is(prop3));
        assertThat(propertyList2.get(3), is(prop4));
    }

}