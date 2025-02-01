package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedAddDuplicatePropertyTest {

    @Test
    public void addDuplicatePropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new Property<String>("DataSource.mysql.user", "test");
        builder.add(property);
        builder.add(property);
    }

}