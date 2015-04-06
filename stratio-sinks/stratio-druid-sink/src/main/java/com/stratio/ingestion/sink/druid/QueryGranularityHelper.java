/*
 * Copyright (C) 2014 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.stratio.ingestion.sink.druid;

import io.druid.granularity.QueryGranularity;

/**
 * Created by eambrosio on 30/03/15.
 */
public class QueryGranularityHelper {
    public static QueryGranularity getGranularity(String type) {
        if ("ALL".equals(type)) {
            return QueryGranularity.ALL;
        } else if ("NONE".equals(type)) {
            return QueryGranularity.NONE;
        } else {
            return QueryGranularity.fromString(type);
        }
    }
}