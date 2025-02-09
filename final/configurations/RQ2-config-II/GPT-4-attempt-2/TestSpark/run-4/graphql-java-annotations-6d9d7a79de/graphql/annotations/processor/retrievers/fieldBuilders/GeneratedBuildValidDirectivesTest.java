package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedBuildValidDirectivesTest {

    @Test
    public void buildValidDirectivesTest() {
        // Prepare
        Method method = Mockito.mock(Method.class);
        Annotation annotation = Mockito.mock(Annotation.class);
        when(method.getAnnotations()).thenReturn(new Annotation[]{annotation});

        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(method, container);

        // Execute
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertEquals(1, directives.length);
    }

}