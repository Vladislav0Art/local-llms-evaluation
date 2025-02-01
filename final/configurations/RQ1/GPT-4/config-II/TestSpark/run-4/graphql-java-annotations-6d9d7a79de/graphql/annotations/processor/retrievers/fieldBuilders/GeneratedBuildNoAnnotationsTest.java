package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class GeneratedBuildNoAnnotationsTest {

    @Test
    public void buildNoAnnotationsTest() {
        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(Method.class), mockContainer);
        GraphQLDirective[] buildResult = builder.build();
        Assert.assertEquals(0, buildResult.length);
    }

}