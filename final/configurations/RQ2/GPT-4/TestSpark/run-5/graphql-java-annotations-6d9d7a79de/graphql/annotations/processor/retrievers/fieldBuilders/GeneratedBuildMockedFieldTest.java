package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class GeneratedBuildMockedFieldTest {

    public class MyClass {
        public String myField;
    }

    @Test
    public void buildMockedFieldTest() {
        Field field = Mockito.mock(Field.class);
        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[0]);
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, container);
        GraphQLDirective[] directives = directivesBuilder.build();

        Assert.assertEquals(0, directives.length);
    }

}