package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.Property.PropertyBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedAdd_PropertyWithDifferentPaths_ThrowsException {

    private static final String PATH_1 = "DataSource.mysql.connection";
    private static final String PATH_2 = "DataSource.mysql.user";
    private static final String PATH_3 = "DataSource.mysql.password";
    private static final String PATH_4 = "DataSource.mysql.table";
    private static final String PATH_5 = "security.enabled";
    private static final String PATH_6 = "security.password";

    @Test
    public void add_PropertyWithDifferentPaths_ThrowsException() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property1 = mock(Property.class);
        Property<?> property2 = mock(Property.class);

        builder.add(property1);
        builder.add(property2);
    }

}