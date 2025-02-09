package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLType;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class GeneratedBuildWithMultipleDirectivesTest {

    @Test
    public void buildWithMultipleDirectivesTest() {
        Field field = Mockito.mock(Field.class);
        Annotation mockAnnotation1 = Mockito.mock(Annotation.class);
        Annotation mockAnnotation2 = Mockito.mock(Annotation.class);
        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[]{mockAnnotation1, mockAnnotation2});
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        GraphQLDirective[] result = builder.build();
        Assert.assertEquals(2, result.length);
    }

    // This class will simulate an annotation with an invalid directive
    @interface annotationWithInvalidDirective {
    }

}