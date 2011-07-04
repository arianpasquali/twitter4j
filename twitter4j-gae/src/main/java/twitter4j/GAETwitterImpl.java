/*
 * Copyright 2007 Yusuke Yamamoto
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
package twitter4j;

import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;
import twitter4j.internal.json.zzzz_T4J_INTERNAL_LazyFactory;

/**
 * @author Yusuke Yamamoto - yusuke at mac.com
 * @since Twitter4J 2.2.4
 */
class GAETwitterImpl extends TwitterImpl {
    GAETwitterImpl(Configuration conf, Authorization auth) {
        super(conf, auth);
    }

    @Override
    protected void setFactory() {
        factory = new zzzz_T4J_INTERNAL_LazyFactory(conf);
    }

}

