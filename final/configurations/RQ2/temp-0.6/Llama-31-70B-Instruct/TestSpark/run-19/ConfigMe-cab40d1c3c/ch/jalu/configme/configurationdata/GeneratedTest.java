package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.PropertyBuilder;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GeneratedTest {

    private static final Property<String> PROPERTY1 =
            PropertyBuilder.ofType(String.class)
                    .name("DataSource.mysql.host")
                    .defaultValue("127.0.0.1")
                    .build();
    private static final Property<String> PROPERTY2 =
            PropertyBuilder.ofType(String.class)
                    .name("DataSource.mysql.port")
                    .defaultValue("3306")
                    .build();
    private static final Property<String> PROPERTY3 =
            PropertyBuilder.ofType(String.class)
                    .name("security.enabled")
                    .defaultValue("false")
                    .build();

    @Test
    public void givenEmptyPropertyListBuilder_whenAdd_thenPropertyAdded() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(PROPERTY1);

        List<Property<?>> properties = propertyListBuilder.create();

        assertEquals(1, properties.size());
        assertEquals(PROPERTY1, properties.get(0));
    }

}