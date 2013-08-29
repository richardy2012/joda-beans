/*
 *  Copyright 2001-2013 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.gen;

import java.util.Map;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectBean;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock used for testing an absence of properties.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public class NoProperties extends DirectBean {

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code NoProperties}.
     * @return the meta-bean, not null
     */
    public static NoProperties.Meta meta() {
        return NoProperties.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(NoProperties.Meta.INSTANCE);
    }

    @Override
    public NoProperties.Meta metaBean() {
        return NoProperties.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    @Override
    public NoProperties clone() {
        BeanBuilder<? extends NoProperties> builder = NoProperties.Meta.INSTANCE.builder();
        for (MetaProperty<?> mp : NoProperties.Meta.INSTANCE.metaPropertyIterable()) {
            if (mp.readWrite().isWritable()) {
                Object value = mp.get(this);
                if (value instanceof Bean) {
                    value = ((Bean) value).clone();
                }
                builder.set(mp.name(), value);
            }
        }
        return builder.build();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(32);
        buf.append("NoProperties{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code NoProperties}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null);

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        public BeanBuilder<? extends NoProperties> builder() {
            return new DirectBeanBuilder<NoProperties>(new NoProperties());
        }

        @Override
        public Class<? extends NoProperties> beanType() {
            return NoProperties.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
