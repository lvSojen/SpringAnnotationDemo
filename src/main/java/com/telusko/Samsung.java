package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
    @Autowired
    @Qualifier("mediaTek") // by doing this fetch mediaTek, @Qualifier> @Primary
    MobileProcessor cpu; // we have two classes that have implemented MobileProcessor
    @Autowired
    MobileProcessor cpu2;
    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config(){
        System.out.println("Octa Core, 4gb Ram, 12 MP Camera");
        cpu.process();
        cpu2.process();
    }
}
