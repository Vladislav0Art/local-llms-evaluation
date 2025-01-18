package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import graphql.annotations.processor.ProcessingElementsContainer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuildWithMultipleValidAnnotationsTest {

    @Test
    public void buildWithMultipleValidAnnotationsTest() {
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        GraphQLDirective annotation1 = Mockito.mock(GraphQLDirective.class);
        GraphQLDirective annotation2 = Mockito.mock(GraphQLDirective.class);
        Field field = Mockito.mock(Field.class);
        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[]{annotation1, annotation2});

        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        GraphQLDirective[] directives = builder.build();

        Assert.assertNotNull(directives);
        Assert.assertEquals(2, directives.length);
    }

}