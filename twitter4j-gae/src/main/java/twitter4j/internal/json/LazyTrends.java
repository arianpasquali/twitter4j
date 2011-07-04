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

import java.util.Date;

/**
 * A data class representing Trends.
 *
 * @author Yusuke Yamamoto - yusuke at mac.com
 * @since Twitter4J 2.0.2
 */

final class LazyTrends implements twitter4j.Trends {
    private twitter4j.internal.http.HttpResponse res;
    private zzzz_T4J_INTERNAL_Factory factory;
    private Trends target = null;

    LazyTrends(twitter4j.internal.http.HttpResponse res, zzzz_T4J_INTERNAL_Factory factory) {
        this.res = res;
        this.factory = factory;
    }

    private Trends getTarget() {
        if (target == null) {
            try {
                target = factory.createTrends(res);
            } catch (TwitterException e) {
                throw new RuntimeException(e);
            }
        }
        return target;
    }

    public Trend[] getTrends() {
        return getTarget().getTrends();
    }


    /**
     * Returns the location associated with the trends.<br>
     * This method is effective only with getLocalTrends() method.<br>
     * i.e. The return value of this method will be null with Search API Methods (getTrends(), getCurrentTrends(), getDailyTrends(), and getWeeklyTrends()).<br>
     *
     * @return location
     * @since Twitter4J 2.1.1
     */
    public Location getLocation() {
        return getTarget().getLocation();
    }


    public Date getAsOf() {
        return getTarget().getAsOf();
    }


    public Date getTrendAt() {
        return getTarget().getTrendAt();
    }


    public RateLimitStatus getRateLimitStatus() {
        return getTarget().getRateLimitStatus();
    }

    public int getAccessLevel() {
        return getTarget().getAccessLevel();
    }

    public int compareTo(Trends target) {
        return getTarget().compareTo(target);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trends)) return false;
        return getTarget().equals(o);
    }

    @Override
    public int hashCode() {
        return getTarget().hashCode();
    }

    @Override
    public String toString() {
        return "LazyTrends{" +
                "target=" + getTarget() +
                "}";
    }
}
