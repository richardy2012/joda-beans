/*
 *  Copyright 2001-2014 Stephen Colebourne
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

import java.util.Date;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock immutable bean to test cloning.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public final class ImmClone implements ImmutableBean {

    // clone non-null
    @PropertyDefinition(validate = "notNull")
    private final Date date;
    @PropertyDefinition(validate = "notNull")
    private final String[] array1;
    @PropertyDefinition(validate = "notNull", get = "clone")
    private final String[] array2;
    @PropertyDefinition(validate = "notNull", get = "cloneCast")
    private final String[] array3;
    // clone nuallable
    @PropertyDefinition()
    private final Date dateNullable;
    @PropertyDefinition()
    private final String[] array1Nullable;
    @PropertyDefinition(get = "cloneCast")
    private final String[] array2Nullable;
    @PropertyDefinition(get = "clone")
    private final String[] array3Nullable;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code ImmClone}.
     * @return the meta-bean, not null
     */
    public static ImmClone.Meta meta() {
        return ImmClone.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(ImmClone.Meta.INSTANCE);
    }

    /**
     * Returns a builder used to create an instance of the bean.
     * @return the builder, not null
     */
    public static ImmClone.Builder builder() {
        return new ImmClone.Builder();
    }

    private ImmClone(
            Date date,
            String[] array1,
            String[] array2,
            String[] array3,
            Date dateNullable,
            String[] array1Nullable,
            String[] array2Nullable,
            String[] array3Nullable) {
        JodaBeanUtils.notNull(date, "date");
        JodaBeanUtils.notNull(array1, "array1");
        JodaBeanUtils.notNull(array2, "array2");
        JodaBeanUtils.notNull(array3, "array3");
        this.date = (Date) date.clone();
        this.array1 = array1.clone();
        this.array2 = array2.clone();
        this.array3 = array3.clone();
        this.dateNullable = (dateNullable != null ? (Date) dateNullable.clone() : null);
        this.array1Nullable = (array1Nullable != null ? array1Nullable.clone() : null);
        this.array2Nullable = (array2Nullable != null ? array2Nullable.clone() : null);
        this.array3Nullable = (array3Nullable != null ? array3Nullable.clone() : null);
    }

    @Override
    public ImmClone.Meta metaBean() {
        return ImmClone.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the date.
     * @return the value of the property, not null
     */
    public Date getDate() {
        return (Date) date.clone();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the array1.
     * @return the value of the property, not null
     */
    public String[] getArray1() {
        return array1.clone();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the array2.
     * @return the value of the property, not null
     */
    public String[] getArray2() {
        return array2.clone();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the array3.
     * @return the value of the property, not null
     */
    public String[] getArray3() {
        return (String[]) array3.clone();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the dateNullable.
     * @return the value of the property
     */
    public Date getDateNullable() {
        return (dateNullable != null ? (Date) dateNullable.clone() : null);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the array1Nullable.
     * @return the value of the property
     */
    public String[] getArray1Nullable() {
        return (array1Nullable != null ? array1Nullable.clone() : null);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the array2Nullable.
     * @return the value of the property
     */
    public String[] getArray2Nullable() {
        return (array2Nullable != null ? (String[]) array2Nullable.clone() : null);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the array3Nullable.
     * @return the value of the property
     */
    public String[] getArray3Nullable() {
        return (array3Nullable != null ? array3Nullable.clone() : null);
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            ImmClone other = (ImmClone) obj;
            return JodaBeanUtils.equal(getDate(), other.getDate()) &&
                    JodaBeanUtils.equal(getArray1(), other.getArray1()) &&
                    JodaBeanUtils.equal(getArray2(), other.getArray2()) &&
                    JodaBeanUtils.equal(getArray3(), other.getArray3()) &&
                    JodaBeanUtils.equal(getDateNullable(), other.getDateNullable()) &&
                    JodaBeanUtils.equal(getArray1Nullable(), other.getArray1Nullable()) &&
                    JodaBeanUtils.equal(getArray2Nullable(), other.getArray2Nullable()) &&
                    JodaBeanUtils.equal(getArray3Nullable(), other.getArray3Nullable());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getArray1());
        hash = hash * 31 + JodaBeanUtils.hashCode(getArray2());
        hash = hash * 31 + JodaBeanUtils.hashCode(getArray3());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDateNullable());
        hash = hash * 31 + JodaBeanUtils.hashCode(getArray1Nullable());
        hash = hash * 31 + JodaBeanUtils.hashCode(getArray2Nullable());
        hash = hash * 31 + JodaBeanUtils.hashCode(getArray3Nullable());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(288);
        buf.append("ImmClone{");
        buf.append("date").append('=').append(getDate()).append(',').append(' ');
        buf.append("array1").append('=').append(getArray1()).append(',').append(' ');
        buf.append("array2").append('=').append(getArray2()).append(',').append(' ');
        buf.append("array3").append('=').append(getArray3()).append(',').append(' ');
        buf.append("dateNullable").append('=').append(getDateNullable()).append(',').append(' ');
        buf.append("array1Nullable").append('=').append(getArray1Nullable()).append(',').append(' ');
        buf.append("array2Nullable").append('=').append(getArray2Nullable()).append(',').append(' ');
        buf.append("array3Nullable").append('=').append(JodaBeanUtils.toString(getArray3Nullable()));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code ImmClone}.
     */
    public static final class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code date} property.
         */
        private final MetaProperty<Date> date = DirectMetaProperty.ofImmutable(
                this, "date", ImmClone.class, Date.class);
        /**
         * The meta-property for the {@code array1} property.
         */
        private final MetaProperty<String[]> array1 = DirectMetaProperty.ofImmutable(
                this, "array1", ImmClone.class, String[].class);
        /**
         * The meta-property for the {@code array2} property.
         */
        private final MetaProperty<String[]> array2 = DirectMetaProperty.ofImmutable(
                this, "array2", ImmClone.class, String[].class);
        /**
         * The meta-property for the {@code array3} property.
         */
        private final MetaProperty<String[]> array3 = DirectMetaProperty.ofImmutable(
                this, "array3", ImmClone.class, String[].class);
        /**
         * The meta-property for the {@code dateNullable} property.
         */
        private final MetaProperty<Date> dateNullable = DirectMetaProperty.ofImmutable(
                this, "dateNullable", ImmClone.class, Date.class);
        /**
         * The meta-property for the {@code array1Nullable} property.
         */
        private final MetaProperty<String[]> array1Nullable = DirectMetaProperty.ofImmutable(
                this, "array1Nullable", ImmClone.class, String[].class);
        /**
         * The meta-property for the {@code array2Nullable} property.
         */
        private final MetaProperty<String[]> array2Nullable = DirectMetaProperty.ofImmutable(
                this, "array2Nullable", ImmClone.class, String[].class);
        /**
         * The meta-property for the {@code array3Nullable} property.
         */
        private final MetaProperty<String[]> array3Nullable = DirectMetaProperty.ofImmutable(
                this, "array3Nullable", ImmClone.class, String[].class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "date",
                "array1",
                "array2",
                "array3",
                "dateNullable",
                "array1Nullable",
                "array2Nullable",
                "array3Nullable");

        /**
         * Restricted constructor.
         */
        private Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3076014:  // date
                    return date;
                case -1409165064:  // array1
                    return array1;
                case -1409165063:  // array2
                    return array2;
                case -1409165062:  // array3
                    return array3;
                case 781387055:  // dateNullable
                    return dateNullable;
                case 221578361:  // array1Nullable
                    return array1Nullable;
                case -1585876102:  // array2Nullable
                    return array2Nullable;
                case 901636731:  // array3Nullable
                    return array3Nullable;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public ImmClone.Builder builder() {
            return new ImmClone.Builder();
        }

        @Override
        public Class<? extends ImmClone> beanType() {
            return ImmClone.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code date} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Date> date() {
            return date;
        }

        /**
         * The meta-property for the {@code array1} property.
         * @return the meta-property, not null
         */
        public MetaProperty<String[]> array1() {
            return array1;
        }

        /**
         * The meta-property for the {@code array2} property.
         * @return the meta-property, not null
         */
        public MetaProperty<String[]> array2() {
            return array2;
        }

        /**
         * The meta-property for the {@code array3} property.
         * @return the meta-property, not null
         */
        public MetaProperty<String[]> array3() {
            return array3;
        }

        /**
         * The meta-property for the {@code dateNullable} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Date> dateNullable() {
            return dateNullable;
        }

        /**
         * The meta-property for the {@code array1Nullable} property.
         * @return the meta-property, not null
         */
        public MetaProperty<String[]> array1Nullable() {
            return array1Nullable;
        }

        /**
         * The meta-property for the {@code array2Nullable} property.
         * @return the meta-property, not null
         */
        public MetaProperty<String[]> array2Nullable() {
            return array2Nullable;
        }

        /**
         * The meta-property for the {@code array3Nullable} property.
         * @return the meta-property, not null
         */
        public MetaProperty<String[]> array3Nullable() {
            return array3Nullable;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3076014:  // date
                    return ((ImmClone) bean).getDate();
                case -1409165064:  // array1
                    return ((ImmClone) bean).getArray1();
                case -1409165063:  // array2
                    return ((ImmClone) bean).getArray2();
                case -1409165062:  // array3
                    return ((ImmClone) bean).getArray3();
                case 781387055:  // dateNullable
                    return ((ImmClone) bean).getDateNullable();
                case 221578361:  // array1Nullable
                    return ((ImmClone) bean).getArray1Nullable();
                case -1585876102:  // array2Nullable
                    return ((ImmClone) bean).getArray2Nullable();
                case 901636731:  // array3Nullable
                    return ((ImmClone) bean).getArray3Nullable();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            metaProperty(propertyName);
            if (quiet) {
                return;
            }
            throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
        }

    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code ImmClone}.
     */
    public static final class Builder extends DirectFieldsBeanBuilder<ImmClone> {

        private Date date;
        private String[] array1;
        private String[] array2;
        private String[] array3;
        private Date dateNullable;
        private String[] array1Nullable;
        private String[] array2Nullable;
        private String[] array3Nullable;

        /**
         * Restricted constructor.
         */
        private Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        private Builder(ImmClone beanToCopy) {
            this.date = (Date) beanToCopy.getDate().clone();
            this.array1 = beanToCopy.getArray1().clone();
            this.array2 = beanToCopy.getArray2().clone();
            this.array3 = beanToCopy.getArray3().clone();
            this.dateNullable = (beanToCopy.getDateNullable() != null ? (Date) beanToCopy.getDateNullable().clone() : null);
            this.array1Nullable = (beanToCopy.getArray1Nullable() != null ? beanToCopy.getArray1Nullable().clone() : null);
            this.array2Nullable = (beanToCopy.getArray2Nullable() != null ? beanToCopy.getArray2Nullable().clone() : null);
            this.array3Nullable = (beanToCopy.getArray3Nullable() != null ? beanToCopy.getArray3Nullable().clone() : null);
        }

        //-----------------------------------------------------------------------
        @Override
        public Object get(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3076014:  // date
                    return date;
                case -1409165064:  // array1
                    return array1;
                case -1409165063:  // array2
                    return array2;
                case -1409165062:  // array3
                    return array3;
                case 781387055:  // dateNullable
                    return dateNullable;
                case 221578361:  // array1Nullable
                    return array1Nullable;
                case -1585876102:  // array2Nullable
                    return array2Nullable;
                case 901636731:  // array3Nullable
                    return array3Nullable;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
        }

        @Override
        public Builder set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case 3076014:  // date
                    this.date = (Date) newValue;
                    break;
                case -1409165064:  // array1
                    this.array1 = (String[]) newValue;
                    break;
                case -1409165063:  // array2
                    this.array2 = (String[]) newValue;
                    break;
                case -1409165062:  // array3
                    this.array3 = (String[]) newValue;
                    break;
                case 781387055:  // dateNullable
                    this.dateNullable = (Date) newValue;
                    break;
                case 221578361:  // array1Nullable
                    this.array1Nullable = (String[]) newValue;
                    break;
                case -1585876102:  // array2Nullable
                    this.array2Nullable = (String[]) newValue;
                    break;
                case 901636731:  // array3Nullable
                    this.array3Nullable = (String[]) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public Builder set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        @Override
        public Builder setString(String propertyName, String value) {
            setString(meta().metaProperty(propertyName), value);
            return this;
        }

        @Override
        public Builder setString(MetaProperty<?> property, String value) {
            super.setString(property, value);
            return this;
        }

        @Override
        public Builder setAll(Map<String, ? extends Object> propertyValueMap) {
            super.setAll(propertyValueMap);
            return this;
        }

        @Override
        public ImmClone build() {
            return new ImmClone(
                    date,
                    array1,
                    array2,
                    array3,
                    dateNullable,
                    array1Nullable,
                    array2Nullable,
                    array3Nullable);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the date.
         * @param date  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder date(Date date) {
            JodaBeanUtils.notNull(date, "date");
            this.date = date;
            return this;
        }

        /**
         * Sets the array1.
         * @param array1  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder array1(String... array1) {
            JodaBeanUtils.notNull(array1, "array1");
            this.array1 = array1;
            return this;
        }

        /**
         * Sets the array2.
         * @param array2  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder array2(String... array2) {
            JodaBeanUtils.notNull(array2, "array2");
            this.array2 = array2;
            return this;
        }

        /**
         * Sets the array3.
         * @param array3  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder array3(String... array3) {
            JodaBeanUtils.notNull(array3, "array3");
            this.array3 = array3;
            return this;
        }

        /**
         * Sets the dateNullable.
         * @param dateNullable  the new value
         * @return this, for chaining, not null
         */
        public Builder dateNullable(Date dateNullable) {
            this.dateNullable = dateNullable;
            return this;
        }

        /**
         * Sets the array1Nullable.
         * @param array1Nullable  the new value
         * @return this, for chaining, not null
         */
        public Builder array1Nullable(String... array1Nullable) {
            this.array1Nullable = array1Nullable;
            return this;
        }

        /**
         * Sets the array2Nullable.
         * @param array2Nullable  the new value
         * @return this, for chaining, not null
         */
        public Builder array2Nullable(String... array2Nullable) {
            this.array2Nullable = array2Nullable;
            return this;
        }

        /**
         * Sets the array3Nullable.
         * @param array3Nullable  the new value
         * @return this, for chaining, not null
         */
        public Builder array3Nullable(String... array3Nullable) {
            this.array3Nullable = array3Nullable;
            return this;
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(288);
            buf.append("ImmClone.Builder{");
            buf.append("date").append('=').append(JodaBeanUtils.toString(date)).append(',').append(' ');
            buf.append("array1").append('=').append(JodaBeanUtils.toString(array1)).append(',').append(' ');
            buf.append("array2").append('=').append(JodaBeanUtils.toString(array2)).append(',').append(' ');
            buf.append("array3").append('=').append(JodaBeanUtils.toString(array3)).append(',').append(' ');
            buf.append("dateNullable").append('=').append(JodaBeanUtils.toString(dateNullable)).append(',').append(' ');
            buf.append("array1Nullable").append('=').append(JodaBeanUtils.toString(array1Nullable)).append(',').append(' ');
            buf.append("array2Nullable").append('=').append(JodaBeanUtils.toString(array2Nullable)).append(',').append(' ');
            buf.append("array3Nullable").append('=').append(JodaBeanUtils.toString(array3Nullable));
            buf.append('}');
            return buf.toString();
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
