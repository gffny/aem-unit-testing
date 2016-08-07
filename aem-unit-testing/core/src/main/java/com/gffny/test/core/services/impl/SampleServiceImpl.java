package com.gffny.test.core.services.impl;

import com.day.cq.wcm.api.Page;
import com.gffny.test.core.models.Car;
import com.gffny.test.core.services.SampleService;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.ResourceResolver;

/**
 * Created by John D. Gaffney | Isobar US
 * 8/6/16
 */
@Component(metatype = false, immediate = false)
@Service(SampleService.class)
public class SampleServiceImpl implements SampleService {

    @Override
    public Car getCarPage(String path, ResourceResolver resourceResolver) {
        return resourceResolver.getResource(path).adaptTo(Car.class);
    }
}
