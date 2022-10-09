/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2014 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.modules;

/**
 * Module load exception, thrown when there is some problem loading a module.
 *
 * @author <a href="mailto:david.lloyd@redhat.com">David M. Lloyd</a>
 */
public class ModuleLoadException extends Exception {

    private static final long serialVersionUID = 3286005346300416890L;

    /**
     * Constructs a {@code ModuleLoadException} with no detail message. The cause is not initialized, and may subsequently
     * be initialized by a call to {@link #initCause(Throwable) initCause}.
     */
    public ModuleLoadException() {
    }

    /**
     * Constructs a {@code ModuleLoadException} with the specified detail message. The cause is not initialized, and may
     * subsequently be initialized by a call to {@link #initCause(Throwable) initCause}.
     *
     * @param msg the detail message
     */
    public ModuleLoadException(final String msg) {
        super(msg);
    }

    /**
     * Constructs a {@code ModuleLoadException} with the specified cause. The detail message is set to:
     * <pre>(cause == null ? null : cause.toString())</pre>
     * (which typically contains the class and detail message of {@code cause}).
     *
     * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method)
     */
    public ModuleLoadException(final Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a {@code ModuleLoadException} with the specified detail message and cause.
     *
     * @param msg the detail message
     * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method)
     */
    public ModuleLoadException(final String msg, final Throwable cause) {
        super(msg, cause);
    }

    /**
     * Convert to an unchecked error type.
     *
     * @return the unchecked error
     */
    public ModuleLoadError toError() {
        final ModuleLoadError error = new ModuleLoadError(getMessage(), getCause());
        error.setStackTrace(getStackTrace());
        return error;
    }
}
