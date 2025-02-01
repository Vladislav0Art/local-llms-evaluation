package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedAddPropertyOverwritingGroupTest {

    @Test
    public void addPropertyOverwritingGroupTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property1 = new Property<String>("DataSource", "test");
        Property<String> property2 = new Property<String>("DataSource.mysql.user", "test2");
        builder.add(property1);
        builder.add(property2);
    }

}