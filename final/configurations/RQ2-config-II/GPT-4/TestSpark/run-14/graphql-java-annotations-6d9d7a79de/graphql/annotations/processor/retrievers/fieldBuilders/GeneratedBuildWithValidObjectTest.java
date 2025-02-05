package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuildWithValidObjectTest {

    @Test
    public void buildWithValidObjectTest() {
        Field field = Mockito.mock(Field.class);
        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[0]);
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        GraphQLDirective[] directives = new DirectivesBuilder(field, container).build();
        Assert.assertNotNull(directives);
    }

}