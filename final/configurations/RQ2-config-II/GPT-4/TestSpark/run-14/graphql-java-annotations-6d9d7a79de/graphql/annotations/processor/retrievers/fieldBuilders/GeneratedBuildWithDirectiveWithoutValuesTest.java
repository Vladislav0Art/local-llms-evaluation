package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuildWithDirectiveWithoutValuesTest {

    @Test
    public void buildWithDirectiveWithoutValuesTest() {
        Field field = Mockito.mock(Field.class);
        GraphQLDirectives directivesAnnotation = Mockito.mock(GraphQLDirectives.class);
        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[]{directivesAnnotation});
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        GraphQLDirective[] directives = new DirectivesBuilder(field, container).build();

        Assert.assertEquals(1, directives.length);
        Assert.assertEquals(directivesAnnotation.name(), directives[0].getName());
    }

}