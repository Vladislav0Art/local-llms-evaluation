package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDirectivesBuilderNullContainerTest {

    @Test
    public void DirectivesBuilderNullContainerTest() {
        Field field = Mockito.mock(Field.class);

        new DirectivesBuilder(field, null);
    }

}