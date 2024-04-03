package dev.simonverhoeven.springboot33demo;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.ProcessInfoContributor;
import org.springframework.stereotype.Component;

@Component
public class CustomProcessInfoContributor extends ProcessInfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        super.contribute(builder);
    }
}
