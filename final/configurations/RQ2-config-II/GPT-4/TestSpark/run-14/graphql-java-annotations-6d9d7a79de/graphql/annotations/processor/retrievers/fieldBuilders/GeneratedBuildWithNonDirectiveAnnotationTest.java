package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuildWithNonDirectiveAnnotationTest {

    @Test
    public void buildWithNonDirectiveAnnotationTest() {
        Field field = Mockito.mock(Field.class);
        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[]{new Override()});
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        GraphQLDirective[] directives = new DirectivesBuilder(field, container).build();
        Assert.assertEquals(0, directives.length);
    }

}