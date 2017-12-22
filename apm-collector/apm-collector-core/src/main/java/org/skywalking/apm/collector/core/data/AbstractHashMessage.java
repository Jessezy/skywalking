/*
 * Copyright 2017, OpenSkywalking Organization All rights reserved.
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
 *
 * Project repository: https://github.com/OpenSkywalking/skywalking
 */

package org.skywalking.apm.collector.core.data;

/**
 * 带哈希码的消息抽象类
 *
 * 见 HashCodeSelector 类。
 *
 * The <code>AbstractHashMessage</code> implementations represent aggregate message,
 * which use to aggregate metric.
 * <p>
 *
 * @author peng-yongsheng
 * @since v3.0-2017
 */
public abstract class AbstractHashMessage {

    /**
     * 哈希码
     */
    private int hashCode;

    public AbstractHashMessage(String key) {
        this.hashCode = key.hashCode();
    }

    public int getHashCode() {
        return hashCode;
    }

    public void setKey(String key) {
        this.hashCode = key.hashCode();
    }
}
