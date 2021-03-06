/*
 * Copyright 2018 The Data Transfer Project Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.datatransferproject.api.action.createjob;

import com.google.inject.AbstractModule;
import org.datatransferproject.security.SymmetricKeyGenerator;
import org.datatransferproject.spi.cloud.storage.JobStore;

/** Dependencies for the {@link CreateJobAction} and related classes. */
public final class CreateJobActionModule extends AbstractModule {

  @Override
  protected void configure() {
    requireBinding(JobStore.class);
    requireBinding(SymmetricKeyGenerator.class);
  }
}
