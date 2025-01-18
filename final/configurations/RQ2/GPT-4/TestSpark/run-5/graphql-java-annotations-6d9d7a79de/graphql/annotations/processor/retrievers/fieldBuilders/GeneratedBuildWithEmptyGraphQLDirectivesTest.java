package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.mockito.Mockito.when;

public class GeneratedBuildWithEmptyGraphQLDirectivesTest {

    @Test
    public void buildWithEmptyGraphQLDirectivesTest() {
        Field field = Mockito.mock(Field.class);
        when(field.getAnnotations()).thenReturn(new Annotation[]{});
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, container);
        GraphQLDirective[] directives = directivesBuilder.build();

        Assert.assertEquals(directives.length, 0);
    }

}