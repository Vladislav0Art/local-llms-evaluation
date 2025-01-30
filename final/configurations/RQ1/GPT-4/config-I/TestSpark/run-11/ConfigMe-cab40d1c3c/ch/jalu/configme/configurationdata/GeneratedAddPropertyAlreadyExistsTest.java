package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddPropertyAlreadyExistsTest {

    @Test
    public void addPropertyAlreadyExistsTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property1 = new StringProperty("database.host", "localhost");
        Property<?> property2 = new StringProperty("database.host", "localhost");
        builder.add(property1);
        builder.add(property2);
    }

}