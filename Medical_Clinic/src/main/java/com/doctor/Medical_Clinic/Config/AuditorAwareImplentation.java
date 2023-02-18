package com.doctor.Medical_Clinic.Config;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;
public class AuditorAwareImplentation implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("test user");
    }
}
