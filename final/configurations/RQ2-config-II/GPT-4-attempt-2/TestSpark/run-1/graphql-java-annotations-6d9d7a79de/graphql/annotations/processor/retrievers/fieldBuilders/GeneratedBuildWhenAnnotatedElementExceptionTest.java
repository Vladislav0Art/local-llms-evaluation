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
public class GeneratedBuildWhenAnnotatedElementExceptionTest {

    @Test
    public void buildWhenAnnotatedElementExceptionTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Field field = Mockito.mock(Field.class);

        when(container.getTypeRetriever()).thenThrow(new GraphQLAnnotationsException("Exception"));

        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        builder.build();
    }

}