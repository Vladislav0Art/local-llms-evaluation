package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddPropertyWithSimilarPathTest {

    @Test
    public void addPropertyWithSimilarPathTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property1 = new StringProperty("DataSource", "");
        Property<?> property2 = new StringProperty("DataSource.mysql", "");

        builder.add(property1);
        builder.add(property2);
    }

}