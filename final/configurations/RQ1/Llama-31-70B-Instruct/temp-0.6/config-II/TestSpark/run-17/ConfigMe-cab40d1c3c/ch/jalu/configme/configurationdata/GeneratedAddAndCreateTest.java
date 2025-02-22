package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedAddAndCreateTest {

    @Test
    public void addAndCreateTest() {
        PropertyListBuilder builder = new PropertyListBuilder();

        Property<?> property1 = new Property<>("DataSource.mysql.password", "");
        Property<?> property2 = new Property<>("DataSource.mysql.username", "");
        Property<?> property3 = new Property<>("security.enabled", false);

        builder.add(property1);
        builder.add(property2);
        builder.add(property3);

        List<Property<?>> properties = builder.create();

        assertEquals(3, properties.size());
        assertEquals(property1, properties.get(0));
        assertEquals(property2, properties.get(1));
        assertEquals(property3, properties.get(2));
    }

}