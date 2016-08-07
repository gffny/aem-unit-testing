package com.gffny.test.service;

import com.gffny.test.context.AemContextBaseTest;
import com.gffny.test.core.models.Car;
import com.gffny.test.core.services.SampleService;
import org.apache.sling.api.resource.ResourceResolver;
import org.junit.Test;

import static com.gffny.test.utils.TestUtils.buildResourcePath;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by John D. Gaffney | Isobar US
 * 6/7/16
 */
public class TestSampleService extends AemContextBaseTest {

    private static String EXTENSION = "json";
    private static String SELECTORS;

    @Test
    public void shouldMockPageObject() {

        SampleService sampleService = getService(SampleService.class);
        assertNotNull(sampleService);
        ResourceResolver resourceResolver = context.resourceResolver();
        Car nullCar = sampleService.getCarPage(buildResourcePath("/content/aemunittesting/en", null, null), resourceResolver);
        assertNull(nullCar);
        Car validCar = sampleService.getCarPage(buildResourcePath("/content/aemunittesting/en/car-stock/range-rover-sport", null, null), resourceResolver);
        assertNotNull(validCar);
        System.out.println(validCar.toString());
    }
}
