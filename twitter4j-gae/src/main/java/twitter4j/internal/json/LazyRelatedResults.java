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

// generated with generate-lazy-objects.sh
package twitter4j.internal.json;

import twitter4j.*;

/**
 * @author Mocel - mocel at guma.jp
 * @since Twitter4J 2.1.8
 */
final class LazyRelatedResults implements twitter4j.RelatedResults {
    private twitter4j.internal.http.HttpResponse res;
    private zzzz_T4J_INTERNAL_Factory factory;
    private RelatedResults target = null;

    LazyRelatedResults(twitter4j.internal.http.HttpResponse res, zzzz_T4J_INTERNAL_Factory factory) {
        this.res = res;
        this.factory = factory;
    }

    private RelatedResults getTarget() {
        if (target == null) {
            try {
                target = factory.createRelatedResults(res);
            } catch (TwitterException e) {
                throw new RuntimeException(e);
            }
        }
        return target;
    }


    /**
     * Returns the 8 or less statuses with conversation
     *
     * @return list of statuses with conversation
     */
    public ResponseList<Status> getTweetsWithConversation() {
        return getTarget().getTweetsWithConversation();
    }


    /**
     * Returns the 8 or less statuses with reply.
     *
     * @return list of statuses with reply
     */
    public ResponseList<Status> getTweetsWithReply() {
        return getTarget().getTweetsWithReply();
    }


    /**
     * Return the 3 or less latest statuses from the user who sent the origin tweet.
     *
     * @return list of latest statuses
     */
    public ResponseList<Status> getTweetsFromUser() {
        return getTarget().getTweetsFromUser();
    }

    public RateLimitStatus getRateLimitStatus() {
        return getTarget().getRateLimitStatus();
    }

    public int getAccessLevel() {
        return getTarget().getAccessLevel();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RelatedResults)) return false;
        return getTarget().equals(o);
    }

    @Override
    public int hashCode() {
        return getTarget().hashCode();
    }

    @Override
    public String toString() {
        return "LazyRelatedResults{" +
                "target=" + getTarget() +
                "}";
    }
}
