package com.telusko;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //by doing this it will fetch SnapDragon
public class SnapDragon implements MobileProcessor{

    @Override
    public void process() {
        System.out.println("World best CPU");
    }
}
