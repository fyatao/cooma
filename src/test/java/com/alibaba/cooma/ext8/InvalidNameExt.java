/*
 * Copyright 2012-2013 Cooma Team.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.cooma.ext8;

import com.alibaba.cooma.Adaptive;
import com.alibaba.cooma.Config;
import com.alibaba.cooma.Extension;

/**
 * 用于测试：
 * 非法的扩展点名
 *
 * @author Jerry Lee(oldratlee AT gmail DOT com)
 */
@Extension("invalid-name&")
public interface InvalidNameExt {
    String echo(@Adaptive("key")  Config config, String s);
}