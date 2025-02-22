package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.PropertyBuilder;
import ch.jalu.configme.properties.types.PrimitivePropertyType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreate_onePropertyAdded_propertyInList {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void initialize() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void create_onePropertyAdded_propertyInList() {
        Property<String> property = PropertyBuilder.create("my.property.path")
                .withInitialValue("initialValue")
                .withType(PrimitivePropertyType.StringType)
                .build();

        propertyListBuilder.add(property);

        assertEquals(1, propertyListBuilder.create().size());
        assertEquals(property, propertyListBuilder.create().get(0));
    }

}