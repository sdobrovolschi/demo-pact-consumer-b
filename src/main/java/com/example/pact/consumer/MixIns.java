package com.example.pact.consumer;

import com.fasterxml.jackson.annotation.JsonCreator;

public interface MixIns {

    abstract class FullNameMixIn {

        @JsonCreator
        FullNameMixIn(String value) {

        }
    }
}
