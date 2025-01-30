package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddDuplicatePropertyTest {

    private PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void addDuplicatePropertyTest() {
        Property<?> property1 = new StringProperty("DataSource.mysql", "defaultValue");
        Property<?> property2 = new StringProperty("DataSource.mysql", "defaultValue");
        builder.add(property1);
        builder.add(property2);
    }

}