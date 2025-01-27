package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAdd_DuplicateProperty_ThrowsConfigMeException {

    @Mock
    private List<Property<?>> properties;

    @Test
    public void add_DuplicateProperty_ThrowsConfigMeException() {
        Mockito.doThrow(ConfigMeException.class)
                .when(new Property<String>("key", "value"))
                .getKey();

        assert ConfigMeException.class.isInstance(new PropertyListBuilder().add(new Property<String>("key", "value")).create());
    }

}