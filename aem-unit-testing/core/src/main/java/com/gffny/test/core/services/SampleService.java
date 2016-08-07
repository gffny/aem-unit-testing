package com.gffny.test.core.services;

import com.gffny.test.core.models.Car;
import org.apache.sling.api.resource.ResourceResolver;

/**
 * Created by John D. Gaffney | Isobar US
 * 8/6/16
 */
public interface SampleService {

    Car getCarPage(String path, ResourceResolver resourceResolver);
}
