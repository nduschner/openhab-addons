/*
 * Copyright (c) 2010-2025 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.tado.swagger.codegen.api.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Static imported copy of the Java file originally created by Swagger Codegen.
 *
 * @author Andrew Fiddian-Green - Initial contribution
 */
@JsonAdapter(PresenceState.Adapter.class)
public enum PresenceState {

    HOME("HOME"),

    AWAY("AWAY");

    private String value;

    PresenceState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PresenceState fromValue(String text) {
        for (PresenceState b : PresenceState.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<PresenceState> {
        @Override
        public void write(final JsonWriter jsonWriter, final PresenceState enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PresenceState read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return PresenceState.fromValue(String.valueOf(value));
        }
    }
}
