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

public class GeneratedAddDuplicateTest {

    @Test
    public void addDuplicateTest() {
        PropertyListBuilder builder = new PropertyListBuilder();

        Property<?> property1 = new Property<>("DataSource.mysql.password", "");

        builder.add(property1);

        Executable executable = () -> builder.add(property1);
        assertThrows(ConfigMeException.class, executable);
    }

}